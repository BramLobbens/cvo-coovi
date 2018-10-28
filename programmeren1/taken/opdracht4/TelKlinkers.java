/*
Programmeren 1 - Opdracht 4
Oefening 4 - TelKlinkers.java
*/
import java.util.Scanner;

public class TelKlinkers {

    public static void main(String[] args) {
    
        Scanner reader = new Scanner(System.in);
        System.out.print("Geef een tekst in: ");
        String tekst = reader.nextLine().toLowerCase();
        reader.close();

        // methode 1
        int count1 = 0;
        for (char c : tekst.toCharArray()) {
            if ("aiueo".indexOf(c) >= 0)
                count1++;
        }

        // methode 2
        int count2 = 0;
        for (int i = 0; i < tekst.length(); i++) {
            if ("aiueo".indexOf(tekst.charAt(i)) >= 0)
                count2++;
        }

        // methode 3
        int count3 = 0;
        for (int i = 0; i < tekst.length(); i++) {
            switch (tekst.charAt(i)) {
            case 'a':
            case 'i':
            case 'u':
            case 'e':
            case 'o':
                count3++;
                break;
            default:    
                continue;
            }
        }
                
        System.out.println("(1) Aantal klinkers: " + count1);
        System.out.println("(2) Aantal klinkers: " + count2);
        System.out.println("(3) Aantal klinkers: " + count3);
    }
}
