import java.util.Scanner;

public class SumOfDigits {
  
  static int getSum(int num, int sum) {
    if (num == 0) {
      return sum;
    }
    sum += num % 10;
    return getSum(num /10, sum);
  }
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int num = s.nextInt();
    int sum = getSum(num, 0);
    System.out.println(sum);
  }
}
