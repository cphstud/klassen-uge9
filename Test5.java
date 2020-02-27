import java.util.Random;
import java.util.Arrays;
public class Test5 {
  /*
1 2 3 5 8 13 21 34
1 2 4 8 16 32 64 128
1 3 7 15 31 63 127 255
   */
  public static final int MAX = 8;
  public static Random rd = new Random();

  public static void main(String[] args) {
   String vovels = "a,e,i,o,u,y";
   String[] vowelsArr = vovels.split(",");
   char[] word = new char[MAX];

   for (int i=0;i<MAX;i++) {
     int rdInt=rd.nextInt(25)+97;
     word[i]=(char) rdInt;
   }

   String myWord = new String(word);
   System.out.println(myWord);
  }
}
