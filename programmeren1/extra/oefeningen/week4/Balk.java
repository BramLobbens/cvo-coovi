/*
Week 4 - extra oefeningen
Oefening 12
*/
import java.util.Scanner;

public class Balk {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("hoogte (cm)?: ");
        double hoogte = Double.parseDouble(input.nextLine());
        System.out.print("breedte (cm)?: ");
        double breedte = Double.parseDouble(input.nextLine());
        System.out.print("diepte (cm)?: ");
        double diepte = Double.parseDouble(input.nextLine());

        double oppervlakte = (hoogte * breedte * 2) +
            (hoogte * diepte * 2) +
            (breedte * diepte * 2);
        double volume = hoogte * breedte * diepte;
        System.out.printf("De oppervlakte van de balk is %.2fcm2\n", oppervlakte);
        System.out.printf("Het volume van de balk is %.2fcm3\n", volume);
    }
}
