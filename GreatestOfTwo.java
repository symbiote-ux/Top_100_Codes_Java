import java.util.Scanner;

public class GreatestOfTwo {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int num1 = s.nextInt();
    int num2 = s.nextInt();
    if (num1 == num2) {
      System.out.println("Equal");
    } else {
      System.out.println(Math.max(num1, num2) + " is Greater");
    }
  }
}
