import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    Boolean loopProgram = true;
    // try for cleaner code, but no error handling
    try (Scanner scan = new Scanner(System.in)) {
      while (loopProgram) {
        System.out.println("Enter 1 for addition, 2 for subtraction,\n3 for multiplication, 4 for division.\n5 to exit.");
        // switch-case to handle selection
        switch(scan.next()) {
          case "1":
            Addition(scan);
            break;
          case "2":
            Subtraction(scan);
            break;
          case "3":
            Multiplication(scan);
            break;
          case "4":
            Division(scan);
            break;
          // case 5 ends program by setting bool = false. Cannot use break due to being inside switch-case
          case "5":
            loopProgram = false;
            break;
          default:
            System.out.println("Selection failed");
            break;
        }
      }
    }
  }
  // method for retrieving numbers as double in array
  private static double[] GetNumbers(Scanner scan) {
    double num[]  = new double[2];
    System.out.println("Enter first number, then the second.");
    num[0] = scan.nextInt();
    num[1] = scan.nextInt();
    return num;
  }
  // method for addition and printing it
  private static void Addition(Scanner scan) {
    double num[] = GetNumbers(scan);
    System.out.println(num[0] + num[1]);
  }
  // method for subtraction and printing it
  private static void Subtraction(Scanner scan) {
    double num[] = GetNumbers(scan);
    System.out.println(num[0] - num[1]);
  }
  // method for multiplication and printing it
  private static void Multiplication(Scanner scan) {
    double num[] = GetNumbers(scan);
    System.out.println(num[0] * num[1]);
  }
  // method for division and printing it
  private static void Division(Scanner scan) {
    double num[] = GetNumbers(scan);
    System.out.println(num[0] / num[1]);
  }
}