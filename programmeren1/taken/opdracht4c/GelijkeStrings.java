import java.util.Scanner;

/**
 * Programmeren 1 - Opdracht 4c
 * Oefening 10 - GelijkeStrings.java
 */
public class GelijkeStrings {

    public static void main(String[] args) {

        String[] xs = new String[2];
        Scanner reader = new Scanner(System.in);

        // lees String waardes in
        for (int i = 0; i < xs.length; i++) {
            System.out.printf("String %d: ", i + 1);
            xs[i] = reader.nextLine();
        }

        // Vergelijk twee String waardes op logische gelijkheid
        System.out.printf("Beide strings zijn %sgelijk\n", xs[0].equals(xs[1]) ? "" : "niet ");
    }
}
