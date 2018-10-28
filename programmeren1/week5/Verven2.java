import java.io.*;
import java.util.Scanner;
import java.util.Locale; // useLocale()

public class Verven2 {
   
    public static void main(String[] args) {
    
        final float LITER = 0.2f; // liter verf per vierkante meter
        Scanner reader = new Scanner(System.in);
        reader.useLocale(Locale.US); // use decimal point (dot)
        
        System.out.print("Prijs verf/l?: ");
        double prijs = reader.nextDouble();
        System.out.print("hoogte?: ");
        double hoogte = reader.nextDouble();
        System.out.print("breedte?: ");
        double breedte = reader.nextDouble();
        System.out.print("lengte?: ");
        double lengte = reader.nextDouble();
        System.out.print("lagen?: ");
        int lagen = reader.nextInt();
        System.out.print("Zijn er ramen (true, false)?: ");
        boolean heeftRamen = reader.nextBoolean();

        double oppervlakte = (lengte * breedte) + 
                             (hoogte * breedte * 2) + 
                             (hoogte * lengte * 2);

        if (heeftRamen) {
            System.out.print("Oppervlakte ramen?: ");
            double oppRamen = reader.nextDouble();
            oppervlakte -= oppRamen;
        }
        
        double totLiter = oppervlakte * lagen * LITER;
        double totPrijs = totLiter * prijs;
        System.out.printf("Voor %.2fm2 heb je %.2f liter verf nodig voor %d lagen.\n",
                        oppervlakte, totLiter, lagen);
        System.out.printf("Dit zal %.2f euro kosten.\n", totPrijs);             
         
    }
}
