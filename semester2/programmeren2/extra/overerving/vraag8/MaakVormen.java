/*
 * Programmeren 2 - Extra Taken
 * Vraag 8
 */
package vraag8;

public class MaakVormen {

    public static void main(String[] args) {

        /*
         * Maak enkele vormen aan
         */
        Rechthoek rh = new Rechthoek(4.0, 6.0);
        RechtDriehoek rdh = new RechtDriehoek(3.0);
        Cirkel c = new Cirkel(5.0);

        /*
         * Test cases
         */
        System.out.println("*****************");
        System.out.println("Test rechthoek lengte 4.0, breedte 6.0");
        System.out.println("Omtrek, expected value: 20.0, value: " + rh.omtrek());
        System.out.println("Oppervlakte, expected value: 24.0, value: " + rh.oppervlakte());
        
        System.out.println("*****************");
        System.out.println("Test rechte driehoek zijde 3.0");
        System.out.println("Omtrek, expected value: 9.0, value: " + rdh.omtrek());
        System.out.println("Oppervlakte, expected value: 3.89, value: " + rdh.oppervlakte());
        
        System.out.println("*****************");
        System.out.println("Test cirkel straal 5.0");
        System.out.println("Omtrek, expected value: 31.42, value: " + c.omtrek());
        System.out.println("Oppervlakte, expected value: 78.54, value: " + c.oppervlakte());

    }
}
