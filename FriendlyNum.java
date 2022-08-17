import java.util.Scanner;

public class FriendlyNum {

  static int getSumOfFactors(int num) {
    int sum = 0;
    for (int i = 1; i <= num / 2; i++) {
      if (num % i == 0) {
                sum += i;
      }
    }
    return sum;
  }
  
  static boolean isFriendlyNum(int num1,int num2) {
    int sum1 = getSumOfFactors(num1);
    int sum2 = getSumOfFactors(num2);
    return sum1 / num1 == sum2 / num2;
  }
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int num1 = s.nextInt();
    int num2 = s.nextInt();
    if (isFriendlyNum(num1,num2)) {
      System.out.println("Friendly Pair");
    } else {
      System.out.println("Not Friendly Pair");
    }
  }
}
