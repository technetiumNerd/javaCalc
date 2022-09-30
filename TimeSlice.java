// class to contain timestamp without crusty shit
public class TimeSlice {
  // small member = short member
  short hr;
  short min;
    // constructor for nice class use
    public TimeSlice(short hr, short min) {
        this.hr = hr;
        this.min = min;
    }
    // toString override for easy nice print
    public String toString() {
      return String.format("%d:%d", this.hr, this.min);
    }
}