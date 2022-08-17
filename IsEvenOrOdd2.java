import java.util.Scanner;

public class IsEvenOrOdd2 {
  
  static boolean isEven(int num) {
    return num % 2 == 0;
  }
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int num = s.nextInt();
    if (isEven(num)) {
      System.out.println("Even");
    } else {
      System.out.println("Odd");
    }
  }
  
}
