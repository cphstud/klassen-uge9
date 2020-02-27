public class TestInitArrs {
  public static void main(String[] args) {
    int[] myNumber = {1, 2, 3};
    int[] numbers = {1, 2, 3};
    int[] xnumbers = {1, 2, 3};
    int numbers2[] = {1, 2, 3};
    int[] numbers3 = null;
    int numbers4[] = new int[3];
    numbers4[0] = 10;
    System.out.println("numbers4 " + numbers4[0]);
    numbers2[1] = (int) 'a';
    System.out.println("numbers2 " + numbers2[1]);
    numbers3[0] = 11;
    System.out.println("numbers3 " + numbers3[0]);
    int resultat = numbers[1] + numbers[3];
  }
}
