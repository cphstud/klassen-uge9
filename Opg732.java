public class Opg732 {
  public static int indexOfMax(int[] inputArr) {
    int retVal = 0;
    // 1,3,12,6,2,9
    for(int i=0;i<inputArr.length-1;i++) {
      if(inputArr[i]>retVal) {
        retVal=inputArr[i];
      }
    }
    return retVal;
  }
  public static void  main(String[] args) {
    int maxVal = indexOfMax(new int[] {1,9,112,3,4,5}); 
    System.out.println(maxVal);
  }

}
