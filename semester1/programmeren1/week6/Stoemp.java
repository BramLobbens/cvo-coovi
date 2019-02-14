/*
Les 6 - If Else
Stoemp.java
*/
import java.util.Scanner;

public class Stoemp {

   public static void main(String[] args) {
   
      Scanner reader = new Scanner(System.in);
      System.out.print("kg witloof: ");
      int witloof = Integer.parseInt(reader.nextLine());
      System.out.print("kg wortel: ");
      int wortel = Integer.parseInt(reader.nextLine());
      System.out.print("kg zoete aardappel: ");
      int zoeteAardappel = Integer.parseInt(reader.nextLine());
      System.out.print("kg spruitjes: ");
      int spruitjes = Integer.parseInt(reader.nextLine());
      
      // 1e versie
      if (witloof > wortel) {
         if (zoeteAardappel > spruitjes) {
            System.out.printf("%sstoemp\n", witloof > zoeteAardappel ? "witloof" : "zoeteAardappel");
         }
         else {
            System.out.printf("%sstoemp\n", witloof > spruitjes ? "witloof" : "spruitjes");
         }
      }
      else {
         if (zoeteAardappel > spruitjes) {
            System.out.printf("%sstoemp\n", wortel > zoeteAardappel ? "wortel" : "zoeteAardappel");
         }
         else {
            System.out.printf("%sstoemp\n", wortel > spruitjes ? "wortel" : "spruitjes");
         }
      }
      
      // 2e versie
      int highest = 0;
      String eten = "";
      
      if (witloof > highest) {
         highest = witloof;
         eten = "witloof";
      }
      if (wortel > highest) {
         highest = wortel;
         eten = "wortel" ;
      }
      if (zoeteAardappel > highest) {
         highest = zoeteAardappel;
         eten = "zoeteAardappel";
      }
      if (spruitjes > highest) {
         highest = spruitjes;
         eten = "spruitjes";
      }
      
      System.out.println("We eten " + eten + "stoemp.");

   }
}   
