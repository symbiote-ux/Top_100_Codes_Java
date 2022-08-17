import java.util.Scanner;

public class SumOfNNaturalNo {

  static int getSum(int num) {
    if (num == 0)
      return num;
    return num + getSum(num - 1);
  }
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int num = s.nextInt();
    int sum = getSum(num);
    System.out.println(sum);

  }
}
