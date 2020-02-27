public class Test3Prime {
  /*
   * 1) linebreak for hver 10. linje
   * 2) Sørg for at fylde op til MAX
   *
   */
  public static final int MAX = 100;
  public static void main(String[] args) {
    int k = 1;
    int counter=0;
    int[] myPrimesArr = new int[MAX];
    do {
      if (isPrime(k)) {
        System.out.println("Adding .." + k + " to " + myPrimesArr.length);
        myPrimesArr[counter]=k;
        counter++;
      }
      k++;

    } while(isNotFull(myPrimesArr));

    for(int i=0;i<MAX;i++) {
      System.out.printf("%d ",myPrimesArr[i]);
    }
  }
  public static boolean isNotFull(int[] myArr) {
    System.out.println("Enter ..i" + myArr.length);
    boolean full = false;
    int sum = 0;
    int prevSum = 0;
    for(int i=0;i<myArr.length;i++) {
      prevSum = sum;
      sum = sum + myArr[i];
      System.out.println("sum: "+sum);
      if (prevSum == sum) {
        full=true;
        return full;
      }
    }
    return full;
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
