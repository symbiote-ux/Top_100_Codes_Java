import java.util.Scanner;

public class ArmStrong {

  static boolean isArmstrong(int num,int order){
    int temp = num;
    int sum = 0, digit;
    while (temp != 0) {
      digit = temp % 10;
      temp /= 10;
      sum += (int) (Math.pow(digit, order));
    }
    return sum == num;
  }

  static int getOrder(int num){
    int len = 0;
    while(num != 0){
      num = num / 10;
      len++;
    }
    return len;
  }

  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int num = s.nextInt();
    int order = getOrder(num);
    if (isArmstrong(num, order)) {
      System.out.println("Armstrong");
    } else {
      System.out.println("Not Armstrong");
    }
  }
}
