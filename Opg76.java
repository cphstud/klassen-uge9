import java.util.Arrays;
public class Opg76 {
  public static void main(String[] args) {
    // create testmaterial
    int[] testPrimes = givePrimes(25);
    System.out.println(Arrays.toString(testPrimes));
  
  }

  public static boolean arePrimeFactors(int n, int[] primeArr) {
    boolean retVal = true;

    return retVal;
  }

  public static int[] givePrimes(int n) {
    int[] retVal = new int[n];
    int idx = 0;
    int numcounter = 2;
    // code

    while(idx < n) {
      if(isPrime(numcounter)) {
        retVal[idx]=numcounter;
        idx++;
      }
      numcounter++;
    }
    return retVal;
  }

  public static int[][] primFactors(int n){
    int[][] retVal = new int[n][n];
    // TODO:primtalsfaktorisering

    return retVal;
  }

  public static boolean isPrime(int n) {
    boolean retVal = true;
    for(int i=2;i<n;i++) {
      if (n%i==0) {
        retVal = false;
        return retVal;
      }
    }
    return retVal;
  }
}
