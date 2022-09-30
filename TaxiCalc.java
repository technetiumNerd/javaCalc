import java.util.Scanner;
public class TaxiCalc {
  public static void main(String[] args) {
    // declare recurrent use variables once
    TimeSlice startTime;
    double fareDistance;
    double startPrice;
    double distancePrice;
    double finalPrice;
    // scan may fail
    try (Scanner scan = new Scanner(System.in)) {
      while (true) {
        // use method to retrieve time from user
        startTime = GetTimeSlice(scan, "Welcome to the taxi calculator!\nEnter your fare start time as HH:MM and then distance traveled in km");
        // use methode to retrieve distance driven from user
        fareDistance = GetFareDistance(scan, "Enter distance travelled");
        // determine pricepoints by time of day at start
        if (startTime.hr < 6) {
          startPrice = 52;
          distancePrice = 22;
        }
        else if (startTime.hr < 18) {
          startPrice = 33;
          distancePrice = 16;
        }
        else {
          startPrice = 47;
          distancePrice = 18;
        }
        // calculate final price
        finalPrice = startPrice + distancePrice * fareDistance;
        System.out.printf("For at fare initiated at: %s, travelling %.2f km costs %.2f DKK.\n", startTime.toString(), fareDistance, finalPrice);
        // prompt user to stop or repeat
        System.out.println("Would you like to stop entering numbers? (y vs any other value)");
        if (scan.next().equalsIgnoreCase("y")) break; else continue;
      }
    }
  }
  // method for getting TimeSlice from console
  private static TimeSlice GetTimeSlice(Scanner scan, String msg) {
    // repeat due to multiple failure conditions
    while (true) {
      System.out.println(msg);
      try {
        String t = scan.next();
        // time value is expected as HH:MM format, so split by it
        String temp[] = t.split(":");
        short hr = Short.parseShort(temp[0]);
        short min = Short.parseShort(temp[1]);
        // test for value validity
        if (hr > 23 || hr < 0 || min > 59 || min < 0) throw new NumberFormatException();
        TimeSlice timeSlice = new TimeSlice(hr, min);
        return timeSlice;
      }
      // if any failure, print and restart. continue included for clarity, though inconsequential
      catch (NumberFormatException e) {
        System.out.println("Input failed. Start over!");
        continue;
      }
    }
  }
  // method for getting distance driven
  private static double GetFareDistance(Scanner scan, String msg) {
    // repeat due to failure condition
    while (true) {
      System.out.println(msg);
      try {
        return Double.parseDouble(scan.next());
      }
      // if any failure, print and restart. continue included for clarity, though inconsequential
      catch (NumberFormatException e) {
        System.out.println("Input failed. Start over!");
        continue;
      }
    }
  }
}
