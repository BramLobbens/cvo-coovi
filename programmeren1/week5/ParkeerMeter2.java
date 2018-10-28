import java.io.*;
import java.util.Scanner;

public class ParkeerMeter2 {

    public static void main(String[] args) {
    
        final String EURO = "\u20ac";
   
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hoeveel 1-Euro stukken?: ");
        int eenEuro = scanner.nextInt();
      
        System.out.println("Hoeveel 2-Euro stukken?: ");
        int tweeEuro = scanner.nextInt();  
      
        System.out.println("Hoeveel 50-cent stukken?: ");
        int vijftigCent = scanner.nextInt();
      
        double totaalVijftigCent = (double) vijftigCent / 2;
        double totaal = eenEuro + tweeEuro * 2 + totaalVijftigCent;
                        
        if (totaal >= 100)
            System.out.printf("Totaal: %s%.2f. Ga naar de bank.\n", EURO, totaal);    
        else
            System.out.printf("Totaal: %s%.2f. Tel verder.\n", EURO, totaal);
   }
}
