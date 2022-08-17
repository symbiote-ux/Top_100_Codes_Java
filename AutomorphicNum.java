import java.util.Scanner;

public class AutomorphicNum {

  static boolean isAutomorphic(int num) {
    int sq = num * num;
    while (num != 0) {
      if(sq % 10 != num % 10){
        return false;
      }
      sq /= 10;
      num /= 10;
    }
    return true;
  }
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int num = s.nextInt();
    if (isAutomorphic(num)) {
      System.out.println(num + " is AutoMorphic of "+ num * num);
    } else {
      System.out.println("Not Automorphic");
    }
  }
}
