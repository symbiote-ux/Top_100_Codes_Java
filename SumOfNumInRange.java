import java.util.Scanner;

public class SumOfNumInRange {

  static int getSum(int start, int end, int sum) {
    if (start > end) {
      return sum;
    }
    return start + getSum(start + 1, end, sum);
  }
    
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int start = s.nextInt();
    int end = s.nextInt();
    int sum = getSum(start, end, 0);
    System.out.println(sum);
  }
  
}
