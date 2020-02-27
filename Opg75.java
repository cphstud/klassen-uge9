import java.util.Scanner;
public class Opg75 {
  public static void main(String[] args) {
    int[] testArr1 = new int[] {3,6,9,12,18,24};
    int[] testArr2 = new int[] {3,6,9,10,12,18,24};
    int n = 3;
    if (areFactors(n,testArr2)) {
      System.out.println("is a factor of " + n);
    } else {
      System.out.println("is not a factor of " + n);
    }

  }
  public static boolean areFactors(int n, int[] arrOfInts) {
    boolean factors = true;
    // 
    for(int i:arrOfInts) {
      if(i%n!=0) {
        factors = false;
        return factors;
      }
    }
    return factors;
  }
}
