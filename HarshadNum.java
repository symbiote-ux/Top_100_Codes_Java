import java.util.Scanner;

public class HarshadNum {

  static boolean isHarshadNum(int num) {
    int temp = num;
    int sum = 0;
    while (temp != 0) {
      int digit = temp % 10;
      sum += digit;
      temp /= 10;
    }
    return num % sum == 0;
  }
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int num = s.nextInt();
    if (isHarshadNum(num)) {
      System.out.println("Harshad Number");
    } else {
      System.out.println("Not Harshad Number");
    }
  }
  
}
