/**
* Programmeren 1 - Les 7
*/
public class ArraysOef3 {

    public static void main(String[] args) {
   
        String[] groenten = new String[] {"aardappel", "courgette", "spinazie", "wortel", "witloof"};
        double[] prijs = new double[] {4.5, 5.0, 6.9, 4.2, 3.0};
        int[] gewicht = new int[] {60, 12, 5, 20, 10};
        
        System.out.println("Prijzen per kilogram:");
        for (int i = 0; i < groenten.length; i++) {
            System.out.printf("%s: %.2f euro/kg\n", groenten[i], prijs[i] / (double) gewicht[i]);
        }
        System.out.println();
        
        // winterprijzen
        prijs = new double[] {9.0, 10.0, 13.8, 8.4, 6.0};
        System.out.println("Prijzen in de winter:");
        for (int i = 0; i < groenten.length; i++) {
            System.out.printf("%s: %.2f euro/kg\n", groenten[i], prijs[i] / (double) gewicht[i]);
        }
        System.out.println();
        
        // aanpassing gewicht
        gewicht[2] = 10;
        System.out.println("Prijs na aanpassing:");
        System.out.printf("%s: %.2f euro/kg\n", groenten[2], prijs[2] / (double) gewicht[2]);
    }
}