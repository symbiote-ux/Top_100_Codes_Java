import java.util.Scanner;

public class ReverseNum {

  static int getReverse(int num, int rev) {
    if (num == 0) {
      return rev;
    }
    int rem = num % 10;
    rev = rev * 10 + rem;
    return getReverse(num / 10, rev);
  }
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int num = s.nextInt();
    int reverse = getReverse(num,0);
    System.out.println(reverse);
  }
}
