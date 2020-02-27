public class Test2Prime {
  /*
   * 1) linebreak for hver 10. linje
   * 2) Sørg for at fylde op til MAX
   *
   */
  public static final int MAX = 100;
  public static void main(String[] args) {

    int counter=0;
    int[] myPrimesArr = new int[MAX];
    for (int i=0;i<MAX;i++) {
      if (isPrime(i)) {
        myPrimesArr[counter]=i;
        counter++;
      }
    }

    for(int i=0;i<MAX;i++) {
      System.out.printf("%d ",myPrimesArr[i]);
    }
  }

  public static boolean isPrime(int number) {
    boolean numberIsPrime = true;
    for (int i=2;i<number;i++) {
      if (number%i == 0) {
        numberIsPrime = false;
        return numberIsPrime;
      }
    }

    return numberIsPrime;
  }
}
