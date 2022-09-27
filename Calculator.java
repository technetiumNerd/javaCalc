import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    Boolean bool = true;
    try (Scanner scan = new Scanner(System.in)) {
      while (bool) {
        System.out.println("Press 1 for addition, 2 for subtraction,\n3 for multiplication, 4 for division.\n5 to exit.");
        switch(scan.nextInt()) {
          case 1:
            Addition(scan);
            break;
          case 2:
            Subtraction(scan);
            break;
          case 3:
            Multiplication(scan);
            break;
          case 4:
            Division(scan);
            break;
          case 5:
            bool = false;
            break;
          default:
            System.out.println("Selection failed");
            break;
        }
      }
    }
  }
  private static int[] GetNumbers(Scanner scan) {
    int num[]  = new int[2];
    System.out.println("Enter first number, then the second.");
    num[0] = scan.nextInt();
    num[1] = scan.nextInt();
    return num;
  }
  private static void Addition(Scanner scan) {
    int num[] = GetNumbers(scan);
    System.out.println(num[0] + num[1]);
  }
  private static void Subtraction(Scanner scan) {
    int num[] = GetNumbers(scan);
    System.out.println(num[0] - num[1]);
  }
  private static void Multiplication(Scanner scan) {
    int num[] = GetNumbers(scan);
    System.out.println(num[0] * num[1]);
  }
  private static void Division(Scanner scan) {
    int num[] = GetNumbers(scan);
    System.out.println(num[0] / num[1]);
  }
}