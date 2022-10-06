package farve;

public class Farve {
  int Red;
  int Green;
  int Blue;
  public Farve() {
    this.Red = 0;
    this.Green = 0;
    this.Blue = 0;
  }
  public Farve(int red, int green, int blue) {
    this.Red = red;
    this.Green = green;
    this.Blue = blue;
  }
  public Farve(Farve farve) {
    this(farve.Red, farve.Green, farve.Blue);
  }
  public void set(int red, int green, int blue) {
    this.Red = normalize(red);
    this.Green = normalize(green);
    this.Blue = normalize(blue);
  }
  public static int normalize(int n) {
    if (n < 0) return 0;
    if (n > 255) return 255;
    return n;
  }
  public boolean equals(Farve f) {
    if (this.Red == f.Red && this.Green == f.Green && this.Blue == f.Blue) return true;
    return false;
  }
  public String toString() {
    if (Red == 255 && Green == 0 && Blue == 0) return "[red]";
    else if (Red == 0 && Green == 255 && Blue == 0) return "[green]";
    else if (Red == 0 && Green == 0 && Blue == 255) return "[blue]";
    else if (Red == 0 && Green == 0 && Blue == 0) return "[black]";
    else return String.format("[%d, %d, %d]", Red, Green, Blue);
  }
}