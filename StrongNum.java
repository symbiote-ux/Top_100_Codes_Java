import java.util.Scanner;

public class StrongNum {

  static int factorial(int num) {
    if (num == 0) {
      return 1;
    }
    return num * factorial(num - 1);
  }
  static boolean isStrong(int num) {
    int temp = num;
    int sum = 0;
    while (temp != 0) {
      int digit = temp % 10;
      int facto = factorial(digit);
      sum += facto;
      temp /= 10;
    }
    return sum == num;
  }

  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int num = s.nextInt();
    if (isStrong(num)) {
      System.out.println("Strong");
    } else {
      System.out.println("Not Strong");
    }
  }
}
