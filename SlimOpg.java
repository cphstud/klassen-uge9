import java.util.Arrays;
public class SlimOpg {
  public static final int MAX=20;

  public static void main(String[] args) {
    int[] myIntArr3 = new int[]{1,3,5,4,7,5,3,2,3,4,2};
    int[] slimArr = new int[MAX];

    // TODO
    // sørg for at der kun er unikke værdier i arrayet
    System.out.println(Arrays.toString(slimArr));
    // output: 1, 3, 5, 4, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

  }
}
