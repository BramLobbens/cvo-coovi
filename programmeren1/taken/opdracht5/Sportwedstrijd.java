import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.*;

/**
 * Programmeren 1 - Opdracht 5
 * Oefening 3 - Sportwedstrijd.java
 */
public class Sportwedstrijd {

    static Scanner reader = new Scanner(System.in);
    /**
     * Verkrijg scores van de gebruiker. Minimum drie waardes.
     */
    public static int[] inputScores(int size) {
        
        int[] xs = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("Geef score %d (op 10): ", i + 1);
            xs[i] = Integer.parseInt(reader.nextLine());
        }
        return xs;
    }

    /*
     * Bereken gemiddelde waarde op tien zonder de laagste en 
     * hoogste scores meegeteld.
     */
    public static double calcFinalScore(int[] xs) {

        int min = Arrays.stream(xs).min().getAsInt();
        int max = Arrays.stream(xs).max().getAsInt();
        int sum = Arrays.stream(xs).sum() - min - max;
        return (double) sum / (xs.length - 2);
    }
    
    public static void main(String[] args) {

        int num = 0;
        while (num < 3) {
            System.out.print("Geef aantal quotaties juryleden in (min 3): ");
            num = Integer.parseInt(reader.nextLine());
        }
        
        System.out.println("Eindscore: "+ calcFinalScore(inputScores(num)));
    }
}
