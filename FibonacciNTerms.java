import java.util.Scanner;

public class FibonacciNTerms {

  static void printNFibonacciTerms(int num) {
    int count = 0;
    int prevTerm = -1;
    int nextTerm = 1;
    int currTerm = prevTerm + nextTerm;
    while (count < num) {
      System.out.print(currTerm + " ");
      prevTerm = nextTerm;
      nextTerm = currTerm;
      currTerm = prevTerm + nextTerm;
      count++;
    }
  }
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int num = s.nextInt();
    printNFibonacciTerms(num);
  }
}
