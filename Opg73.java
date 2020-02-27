public class Opg73 {
  public static int indexOfMax(int[] inputArr) {
    int retVal = 0;
    for(int i=0;i<inputArr.length;i++) {
      if (inputArr[i]>retVal) {
        retVal=i;
      }
    }
    return retVal;
  }
  public static void  main(String[] args) {
    int[] testArr = new int[]{1,3,5,4,3,1,77,3,2};
    int maxVal = indexOfMax(new int[] {1,2,9,2,3,4,5}); 
     maxVal = indexOfMax(testArr);
    System.out.println("max: " + maxVal + " value: "+ testArr[maxVal] );
  }

}
