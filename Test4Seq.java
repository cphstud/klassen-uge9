public class Test4Seq {
  /*
1 2 3 5 8 13 21 34
1 2 4 8 16 32 64 128
1 3 7 15 31 63 127 255
   */
  public static final int MAX = 8;
  public static void main(String[] args) {

    int[] myArr = new int[MAX];
    myArr[0]=1;
    myArr[1]=2;
    for(int i=2;i<MAX;i++) {
      myArr[i]=myArr[i-2]+myArr[i-1];
    }
    for(int i=0;i<MAX;i++) {
      System.out.printf(" %d",myArr[i]);
    }

    System.out.println();

    for(int i=1;i<MAX;i++) {
      myArr[i]=2*myArr[i-1];
    }
    for(int i=0;i<MAX;i++) {
      System.out.printf(" %d",myArr[i]);
    }

    System.out.println();

    for(int i=1;i<MAX;i++) {
      myArr[i]=2*myArr[i-1]+1;
    }
    for(int i=0;i<MAX;i++) {
      System.out.printf(" %d",myArr[i]);
    }
    System.out.println();
    System.out.println();
  }
}
