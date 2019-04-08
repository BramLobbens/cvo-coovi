package bedrijf;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class TestKlant {

    public static void main(String[] args) {
        
        /*
        * Maak enkele klanten van elk type.
        */
        Klant jan = new Klant("Jan");
        Groothandelaar piet = new Groothandelaar("Piet", 0.20);
        DetailKlant johan = new DetailKlant("Johan");
        
        List<Klant> klanten = new ArrayList<>();
        klanten.add(jan);
        klanten.add(piet);
        klanten.add(johan);
        
        /*
        * Maak een reeks aankopen.
        */
        Random rand = new Random();
        int aantal = 5; // aantal aankopen
        while (aantal-- > 0) {
            // random aankoop tussen 10 en 500 euro
            double bedrag = (double) Math.round(10 + (500 - 10) * rand.nextDouble() * 100.0) / 100.0;
            klanten.forEach((klant) -> {
                klant.aankoop(bedrag);
            });
        }
        
        /*
        * Print aantal klanten.
        */
        System.out.println("Verwacht aantal klanten: 3");
        System.out.println("Aantal:" + Klant.getAantal());
        System.out.println("");
        
        /*
        * Print gemaakte aankopen en aankoopsom.
        */
        System.out.println("Gemaakte aankopen:");
        for (Klant klant : klanten) {
            System.out.println(klant.getBedragen());
            System.out.println(klant);
            System.out.println("****************");
        }  
        
    }
}
