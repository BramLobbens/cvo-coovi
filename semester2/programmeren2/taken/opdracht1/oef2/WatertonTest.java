package oef2;

/**
 * Programmeren 2 - Opdracht1
 * Oefening 2
 */
public class WatertonTest {

    public static void main(String[] args) {

        Waterton tonA = new Waterton(30);
        System.out.println(tonA);

        // Test aftappen
        double afgetapt = tonA.aftappenWater(10);
        System.out.println("Expected value: 0.0\tReturned value: " + afgetapt);

        // Test overlopen
        boolean overgelopen = tonA.opvangenWater(20);
        System.out.println("Expected value: false\tReturned value: " + overgelopen);
        
        System.out.println(tonA);

        // Test aftappen
        afgetapt = tonA.aftappenWater(10);
        System.out.println("Expected value: 10.0\tReturned value: " + afgetapt);

        System.out.println("-----------------");

        Waterton tonB = new Waterton(20, 20);
        System.out.println(tonB);

        // Test aftappen
        afgetapt = tonB.aftappenWater(10);
        System.out.println("Expected value: 10.0\tReturned value: " + afgetapt);

        // Test overlopen
        overgelopen = tonB.opvangenWater(20);
        System.out.println("Expected value: true\tReturned value: " + overgelopen);
        
        System.out.println(tonB);

        // Test aftappen
        afgetapt = tonB.aftappenWater(30);
        System.out.println("Expected value: 20.0\tReturned value: " + afgetapt);

    }
}
