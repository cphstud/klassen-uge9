class DrawBox {
  public static void main(String[] args) {
    drawBox(6,10);
    /*
     * FORMÅL: 
     * for-loops samt parametrisere printf
     * dvs at System.out.printf("%14s%n","#") bliver til
     * format = "%" + variabel + "s%n";
     * myChar = "*"
     * System.out.printf(format,myChar);
     * 
     *
     * OPGAVEN:
     * tegn en firkant vha  metoden drawBox hvor højde og bredde 
     * angives som parametre 
     *
     * TESTKØRSEL:
     * drawBox(6,10) giver flg. figur

        **********
        *        *
        *        *
        *        *
        *        *
        **********

*/

  }
  public static void drawBox(int height, int width) {
    String format = "";
    String myEmpty = " ";
    writeChars('*',width);
    // TODO: skriv for-loop hvor hver iteration tegner en linje
    // og hvor antallet af loops begrænses af height samt at
    // width indgår i formateringen af printf.

  }
  public static void writeChars(char myChar, int frequency) {
    //TODO: skriv for-loopet der printer myChar 
  }
}
