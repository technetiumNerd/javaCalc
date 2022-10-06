package farve;

public class Main {
  public static void main(String[] args) {
    Farve farve = new Farve(255, 0, 0);
    System.out.println(farve.toString());
    farve.set(0, 255, 0);
    System.out.println(farve.toString());
    Farve andenFarve = new Farve(128, 64, 192);
    System.out.println(andenFarve.toString());
    System.out.println(farve.equals(andenFarve));
    System.out.println(farve.equals(farve));
  }
}