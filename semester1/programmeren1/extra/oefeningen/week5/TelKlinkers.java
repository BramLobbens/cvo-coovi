/*
Week 5 - extra oefeningen
Oefening 4 - TelKlinkers.java
*/
// extra oplossing voor Opdracht 4 - Oefening 4
import java.util.Scanner;

public class TelKlinkers {

    public static void main(String[] args) {
    
        Scanner reader = new Scanner(System.in);
        System.out.print("Geef een tekst in: ");
        String tekst = reader.nextLine().toLowerCase();
        reader.close();

        // methode 4
        System.out.print("(4) Aantal klinkers: ");
        System.out.println(tekst.length() - tekst.toLowerCase().replaceAll("a|e|i|o|u|", "").length());
    }
}
