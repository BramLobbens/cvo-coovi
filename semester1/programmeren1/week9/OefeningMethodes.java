import java.util.Random;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Scanner;

/**
 * Programmeren - week9
 */
public class OefeningMethodes {

    // eerste versie berekenGemiddelde
    private static double berekenGemiddelde(int[] vals) {
        double sum = 0.0;
        for (int val : vals) {
            sum += val;
        }
        return sum / (vals.length);
    }

    // tweede versie berekenGemiddelde (Java 8+)
    private static double berekenGemiddelde_(int[] vals) {
        List<Integer> valList = new ArrayList<>();
        for (int val : vals) valList.add(val);
        return valList.stream().collect(Collectors.averagingInt(a -> a));
    }

    public static void main(String[] args) {
        
        final int NUM_STUDENTEN = 10; // aantal studenten
        final int NUM_TOETSEN = 4; // aantal toetsen per student
        
        // Verkrijg NUM_STUDENTEN namen van studenten
        String[] namen = new String[NUM_STUDENTEN];
        System.out.println("Namen van de studenten:");
        try (Scanner reader = new Scanner(System.in)) {
            for (int i = 0; i < namen.length; i++) {
                namen[i] = reader.nextLine();
            }
        }
        
        // geef NUM_TOETSEN random punten tussen 1 en 100 aan studenten
        int[][] punten = new int[NUM_STUDENTEN][NUM_TOETSEN];
        Random rand = new Random();
        for (int i = 0; i < punten.length; i++) {
            System.out.print(namen[i] + ": ");
            for (int j = 0; j < punten[i].length; j++ ) {
                punten[i][j] = rand.nextInt(100) + 1;
                System.out.print(punten[i][j] + ", ");
            }
            System.out.println();
        }
        System.out.println();
        
        // bereken en toon gemiddelde per student
        for (int i = 0; i < punten.length; i++) {
            int[] puntenStudent = new int[NUM_TOETSEN];
            for (int j = 0; j < punten[i].length; j++) {
                puntenStudent[j] = punten[i][j];
            }
            // methode 1
            //System.out.println("Gemiddelde score van student \"" + namen[i] +
            //                 "\": " + berekenGemiddelde(puntenStudent));
            // methode 2
            System.out.println("Gemiddelde score van student \"" + namen[i] +
                               "\": " + berekenGemiddelde_(puntenStudent));
        }
    }
}
