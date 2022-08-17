import java.util.Scanner;

public class IsPositiveOrNegative1 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int num  = s.nextInt();
    if (num == 0) {
      System.out.println("Zero");
    } else {
      String result = num > 0 ? "Positive" : "Negative";
      System.out.println(result);
    }
  }
}