import java.util.Random;
import java.util.Arrays;
public class Chap7 {
  public static final int MAX=25;
  public static void main(String[] args) {

    //create arrays

    int[] myFirstArr;
    myFirstArr = new int[MAX];
    int[] myIntArr = new int[MAX];
    int[] myIntArr3 = new int[MAX];
    int[] myIntArr2 = {1,4,3,6,5,1,0,3,4};
    for(int i=0;i<MAX;i++) {
      myIntArr[i]=2*i;
    }
    int counter=0;
    while(counter<MAX) {
      myIntArr3[counter]=(counter%5);
      counter++;
    }

    //accessing elements
    myIntArr3[0]=0;
    //modyfying elements
    myIntArr3[0]++;
    myIntArr3[0]++;
    myIntArr3[0]++;

    //Displaying arrays
    counter=0;
    int linebreak=8;
    while(counter<MAX) {
      if (counter%linebreak!=0) {
        System.out.printf("%d",myIntArr3[counter]);
      } else {
        System.out.printf("%d%n",myIntArr3[counter]);
      }
      counter++;
    }
    //using util
    System.out.println(Arrays.toString(myIntArr3));

    //Copying arrays

    // manually
    int[] targetArr = new int[MAX+6];
    for (int i=0;i<myIntArr3.length;i++) {
      targetArr[i]=myIntArr3[i];

    }
    // the bad way
    int[] myCp = myIntArr3;
    //int[] myCp = Arrays.copyOfRange(myIntArr3,0,(myIntArr3.length));
    System.out.println(Arrays.toString(myCp));
    myCp[0]=123123;
    System.out.println(Arrays.toString(myCp));
    System.out.println(Arrays.toString(myIntArr3));

    //Array traversal
    //just print
    //search
    int item=2;
    counter = 0;
    while(counter<myIntArr3.length) {
      if (myIntArr3[counter] == item) {
        System.out.println("Found "+ item + " at pos "+ counter);
      }
      counter++;
    }

    //Manipulate
    //to slim

    counter = 0;
    int slimcounter = 0;
    boolean isThere = false;
    int[] slimArr = new int[MAX+1];
    while(counter<myIntArr3.length) {
      for(int i = 0;i<=counter;i++) {
        System.out.println(i + " "+ counter + " "+slimcounter);
        if (myIntArr3[counter]==slimArr[i]){
          isThere=true;
        }
      }
      if (!isThere) {
        slimArr[slimcounter]=myIntArr3[counter];
        slimcounter++;
      }
      counter++;
    }
    System.out.println(Arrays.toString(slimArr));


    //Random numbers
    //fill 

    int[] myRdArr = new int[MAX];
    Random rd = new Random();
    for (int i=0;i<MAX;i++) {
      myRdArr[i] = rd.nextInt(20)+1;
    }
    int sum=0;
    for (int i=0;i<MAX;i++) {
      sum+=myRdArr[i];
    }
    System.out.println("arra "+Arrays.toString(myRdArr));
    System.out.println("middelværdien "+sum/((double)MAX));

    //fill with primes


    //Building a histogram



    //Enhanced for-loop


    //counting chars


    //Strings
    String order="roser,tulipaner;Ja til grønt;345;Otto Verner;Gyden 12;4500 Odense";
    String[] orderArr = order.split(";");
    String flowers = orderArr[0];
    for (int i=1;i<orderArr.length) {

    }
    String address = orderArr[1];
    String[] flowersArr = flowers.split(",");

}
