package temperatur;

public class Main {
  public static void main(String[] args) {
    Temperatur temp = new Temperatur((double)37, 'c');
    System.out.println(temp.getCTemp());
    System.out.println(temp.getFTemp());
    System.out.println(temp.toString());
    double d = 90;
    temp.setCTemp(d);
    System.out.println(temp.toString());
  }
}
