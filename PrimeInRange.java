import java.util.Scanner;

public class PrimeInRange {

  static boolean isPrime(int num) {
    if (num < 2) {
      return false;
    }
    for (int i = 2; i <= Math.sqrt(num); i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int start = s.nextInt();
    int end = s.nextInt();
    for (int i = start; i <= end; i++) {
      if (isPrime(i)) {
        System.out.println(i);
      }
    }
  }
}
