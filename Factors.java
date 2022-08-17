import java.util.Scanner;

public class Factors {
  static void printFactors(int num) {
    for (int i = 1; i <= Math.sqrt(num); i++) {
      if (num % i == 0) {
        if (i == num / i) {
          System.out.print(i + " ");
        } else {
          System.out.print(i+" "+num/i+" ");
        }
      } 
    }
  }
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int num = s.nextInt();
    printFactors(num);
  }
}
