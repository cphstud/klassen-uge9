class AsciiArtPyraOne {
  public static void main(String[] args) {
    /*
     * FORMÅL: 
     * At formatere output 
     *
     * OPGAVEN:
     * Tegn flg figur ved hjælp af #, mellemrum og printf
     * hint: gem tegnet i en streng-variabel og brug formatspecifiers
     * til at lave passende mellemrum
     
     
      		      #      	
      		     ###    
      		    ##### 
      		   #######
      	          #########
      	         ############
      
     */

    // løsning
    String myC = "#";
    String space = " ";
    int c = 11;
    String format = "";
    int limit = 16;
    while(c<limit) {
      format = "%"+c+"s%n";
    System.out.printf(format,myC);
    myC = myC + "#";
    c++;
    }

    /*
    System.out.printf("%11s%n",myC);
    myC = "###";
    System.out.printf("%12s%n",myC);
    myC = "#####";
    System.out.printf("%13s%n",myC);
    myC = "#######";
    System.out.printf("%14s%n",myC);
    myC = "#########";
    System.out.printf("%15s%n",myC);
    myC = "###########";
    System.out.printf("%16s%n",myC);
    */
  }
}
