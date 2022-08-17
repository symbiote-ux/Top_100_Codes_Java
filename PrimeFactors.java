import java.util.Scanner;

public class PrimeFactors {

  static boolean isPrime(int num) {
    for (int i = 2; i <= Math.sqrt(num); i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }

  static void printPrimeFactors(int num) {
    for (int i = 2; i <= num; i++) {
      if (isPrime(i)) {
        int temp = num;
        while (temp % i == 0) {
          System.out.println(i + " ");
          temp /= i;
        }
      }
    }
  }
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int num = s.nextInt();
    printPrimeFactors(num);
    }
}
