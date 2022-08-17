import java.util.Scanner;

public class AbudantNum {

  static boolean isAbundantNum(int num) {
    int sum = 0;
    for (int i = 1; i <= num / 2; i++) {
      if (num % i == 0) {
        sum += i;
      }
    }
    return sum > num;
  }
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int num = s.nextInt();
    if (isAbundantNum(num)) {
      System.out.println("Abundant Number");
    } else {
      System.out.println("Not Abundant Number");
    }
  }
}
