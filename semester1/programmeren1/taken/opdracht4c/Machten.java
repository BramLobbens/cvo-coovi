import java.util.Scanner;

/**
 * Programmeren 1 - Opdracht 4c
 * Oefening 5 - Machten.java
 */
public class Machten {

    public static void main(String[] args) {

        System.out.println("Berekening van machten");
        System.out.print("Geef het grondtal: ");
        Scanner reader = new Scanner(System.in);
        int grondtal = Integer.parseInt(reader.nextLine());
        
        int[] machten = new int[10];
        for (int i = 0; i < machten.length; i++)
            // Math.pow leest type 'double' in
            machten[i] = (int) Math.pow((double) grondtal, (double) i);

        System.out.print("De machten zijn: ");
        for (int macht : machten)
            System.out.print(macht + " ");
        System.out.println();
    }
}
