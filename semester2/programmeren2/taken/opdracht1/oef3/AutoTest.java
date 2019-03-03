package oef3;

/**
 * Programmeren 2 - Opdracht1
 * Oefening 3
 */
public class AutoTest {

    public static void main(String[] args) {

        Auto nieuweAuto = new Auto(60.0, 6.0);
        System.out.println(nieuweAuto);

        // Test vul tank
        nieuweAuto.vulTank();
        System.out.println("Expected value: 60.0 l bijgetankt.");
        System.out.println(nieuweAuto);
        
        // Test kilometers rijden
        nieuweAuto.aantalKilometerRijden(1000.0);
        System.out.println("Expected value: 1000 km");
        System.out.println(nieuweAuto);

        System.out.println("-----------------");
        
        Auto occasieAuto = new Auto(22000.0, 45.0, 45.0, 3.8);
        System.out.println(occasieAuto);

        // Test vul tank
        occasieAuto.vulTank();
        System.out.println("Expected value: 0.0 l bijgetankt.");
        System.out.println(occasieAuto);
        
        // Test kilometers rijden
        occasieAuto.aantalKilometerRijden(1200.0);
        System.out.println("Expected value: 23184.2 km");
        System.out.println(occasieAuto);

    }
}
