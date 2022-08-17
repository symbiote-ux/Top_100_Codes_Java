import java.util.Scanner;

public class Fibonacci {

  static void printFibonacci(int num){
    int prevTerm = -1;
    int nextTerm = 1;
    int currTerm = prevTerm + nextTerm;
    while(currTerm <= num ){
      System.out.print(currTerm + " ");
      prevTerm = nextTerm;
      nextTerm = currTerm;
      currTerm = prevTerm + nextTerm;
    }
  }
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int num = s.nextInt();
    printFibonacci(num);
  }
}
