import java.util.Scanner;

public class Factorial {
  static int factorial(int num ){
    if (num == 0) {
      return 1;
    }
    return num * factorial(num - 1);
    }
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int num = s.nextInt();
    System.out.println(factorial(num));
  }
}

