import java.util.Scanner;

/**
 * Programmeren 1 - 06/12
 */
public class Oppervlaktes {

    /**
     * bereken oppervlakte rechthoek
     */
    public static double oppRechthoek(double lengte, double breedte) {
        return lengte * breedte;
    }

    /** 
     * bereken oppervlakte cirkel 
     */
    public static double oppCirkel(double straal) {
        return straal * straal * Math.PI;
    }

    /**
     * bereken oppervlakte kubus 
     */
    public static double oppKubus(double lengte, double breedte, double hoogte) {
        return (lengte * breedte * 2) + (lengte * hoogte * 2) + (breedte * hoogte * 2);
    }

    public static void main(String[] args) {
        
        System.out.println("Bereken oppervlakte van een rechthoek (R), cirkel (C) of kubus (K)");
        try (Scanner reader = new Scanner(System.in)) {
            switch (reader.nextLine().toLowerCase()) {
            case "r":
                System.out.print("Geef breedte: ");
                double breedte = Double.parseDouble(reader.nextLine());
                System.out.print("Geef lengte: ");
                double lengte = Double.parseDouble(reader.nextLine());
                System.out.println("Oppervlakte is: " + oppRechthoek(lengte, breedte));
                break;
            case "c":
                System.out.print("Geef straal: ");
                double straal = Double.parseDouble(reader.nextLine());
                System.out.println("Oppervlakte is: " + oppCirkel(straal));
                break;
            case "k":
                System.out.print("Geef breedte: ");
                double breedteKubus = Double.parseDouble(reader.nextLine());
                System.out.print("Geef lengte: ");
                double lengteKubus = Double.parseDouble(reader.nextLine());
                System.out.print("Geef hoogte: ");
                double hoogte = Double.parseDouble(reader.nextLine());
                System.out.println("Oppervlakte is: " + oppKubus(lengteKubus, breedteKubus, hoogte));
                break;
            default:
                System.out.println("Ongekende input");
            }
        }
    }
}
