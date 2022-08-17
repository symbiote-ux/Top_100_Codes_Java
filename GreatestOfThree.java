import java.util.Scanner;

public class GreatestOfThree {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int num1 = s.nextInt();
    int num2 = s.nextInt();
    int num3 = s.nextInt();
    int temp = num1 > num2 ? num1 : num2;
    int result = temp > num3 ? temp : num3;
    System.out.println(result);
  }
}
