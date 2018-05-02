public class TableOfBases {
   public static void main(String args[]) {
      System.out.println("Decimal\t  " + "Binary\t" + "Octal\t" + "Hex\t" + "Character");
      for (int i = 65; i < 91; i++) {
         System.out.println(i + "\t  " + Integer.toString(i, 2) + "\t" + Integer.toString(i, 8) + "\t" +
         Integer.toString(i, 16) + "\t" + (char)i);
      }
   }
}
