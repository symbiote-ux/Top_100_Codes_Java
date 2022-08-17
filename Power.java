import java.util.Scanner;

public class Power {
  
static double getPower(int num,int expo){
  double result = 1.0;
  while (expo != 0) {
    result *= num;
    expo--;
  }
  return result;
  }
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int num = s.nextInt();
    int expo = s.nextInt();
    double power = getPower(num, expo);
    System.out.println(power);
  }
}
