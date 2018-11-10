/*
Les 6 - Switch
Talen.java
*/
import java.util.Scanner;

public class Talen {

   public static void main(String[] args) {
   
      Scanner reader = new Scanner(System.in);
      System.out.print("Selecteer (NL|FR|DE|EN): ");
      String taal = reader.nextLine().toLowerCase();
      String greet = "";
      switch (taal) {
         case "nl": // Nederlands
            greet = "Welkom in de les programmeren 1";
            break;
         case "fr": // Frans
            greet = "Bienvenue dans le cours de programmation 1";
            break;
         case "de": // Duits
            greet = "Willkommen in der Programmierungkursus 1";
            break;
         case "en": // Engels
            greet = "Welcome to programming 1";
            break;
         default: // Afrikaans
            greet= "Welkom in die programmeringskursus 1";
            break;
      }
      System.out.println(greet);
   }
}   
