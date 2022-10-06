package pengekasse;

public class Main {
  public static void main(String[] args) {
    PengeKasse pengeKasse = new PengeKasse(4,3, 3, 4, 2);
    System.out.println(pengeKasse);
    System.out.println(pengeKasse.sum());
    System.out.println(pengeKasse.givTilbage(71).toString());

    System.out.println(pengeKasse.sum());
    System.out.println(pengeKasse.toString());
  }  
}
