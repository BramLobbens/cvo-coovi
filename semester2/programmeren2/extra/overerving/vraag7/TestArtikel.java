/*
 * Programmeren 2 - Extra Taken
 * Vraag 7
 */
package vraag7;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class TestArtikel {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        List<Artikel> artikels = new ArrayList<>();

        // Vraag artikelgegevens op aan de gebruiker.
        // Break bij leeglaten naam.
        while (true) {

            System.out.print("naam artikel: ");
            String naam = reader.nextLine();
            if (naam.isEmpty()) {
                break;
            }
            
            System.out.print("nettoprijs: ");
            int nettoPrijs = Integer.parseInt(reader.nextLine());
            
            System.out.print("percent BTW: ");
            double percentBTW = Double.parseDouble(reader.nextLine());
            
            System.out.print("korting (ja/neen)? ");
            String antw = reader.nextLine();
            boolean heeftKorting = antw.toLowerCase().equals("ja");

            // Voeg artikel toe als Koopje of Artikel naargelang deze
            // korting heeft of niet en vraag deze korting op.   
            if (heeftKorting) {
                System.out.print("korting: ");
                double korting = Double.parseDouble(reader.nextLine());

                artikels.add(new Koopje(naam, nettoPrijs, percentBTW, korting));
            }
            else {
                artikels.add(new Artikel(naam, nettoPrijs, percentBTW));
            }

            System.out.println("------------");
        }

        // Druk naam en verkoopprijs af van alle artikels
        System.out.println("\nArtikels:");
        artikels.forEach(a -> {
                System.out.println(a.getNaam() + " " + a.getPrijsInclusiefBTW());
            });
    }
}
