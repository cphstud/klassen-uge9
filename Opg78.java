public class Opg78 {
  public static void main(String[] args) {
    String a = "stop";
    String b = "pots";
    System.out.println(isAnagram(a,b));
  
  }
  public static boolean isAnagram(String a, String b) {
    boolean retVal = true;
    for(int i=0;i<a.length();i++) {
      if(a.charAt(i)!= b.charAt((a.length()-1)-i)) {
        System.out.println(a + " is not an anagram of " + b);
        retVal = false;
      }
    }
    return retVal;
  }
}
