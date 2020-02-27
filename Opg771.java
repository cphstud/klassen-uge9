import java.util.Arrays;
public class Opg771 {
  public static void main(String[] args) {
    int[] retVal = letterHist("kurt");
    for(int i=0;i<retVal.length;i++) {
      System.out.printf("%c:%d ",(i+97),retVal[i]);
    }
  }
  public static int[] letterHist(String name) {
    int[] retVal = new int[28];
    int a = 97;
    for(int i = 0;i<name.length();i++) {
      char c = name.charAt(i);
      int idx =(int)c-a;
      retVal[idx]++;
    }
    return retVal;
  }

}
