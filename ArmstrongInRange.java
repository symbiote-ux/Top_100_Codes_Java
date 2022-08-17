import java.util.Scanner;

public class ArmstrongInRange {
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
    int start = s.nextInt();
    int end = s.nextInt();
    for (int i = start; i <= end; i++) {
      int order = getOrder(i);
      if (isArmstrong(i, order)) {
        System.out.println(i);
      }
    }
  }
}
