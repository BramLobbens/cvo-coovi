import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * Programmeren 1 - Opdracht6
 * Oefening 1
 */
public class VerschilKlasgemiddelde {

    /**
     * bereken gemiddelde van een double array
     */
    private static double berekenGemiddelde(double[] vals) {
        double sum = 0.0;
        for (double val : vals) {
            sum += val;
        }
        return Math.round((sum / (vals.length)) * 10.0) / 10.0; // rond af tot 1 decimale plaats
    }

    public static void main(String[] args) {

        final int NUM_STUDENTEN = 5; // aantal studenten
        String[] namen = new String[NUM_STUDENTEN]; // namen studenten
        double[] punten = new double[NUM_STUDENTEN]; // punten studenten

        // lees namen en punten van input file en voer in deze in de arrays
        // namen en punten
        try (Scanner reader = new Scanner(new File("studenten.txt"))) {
            
            for (int i = 0; reader.hasNext(); i++) {
                String[] line = reader.nextLine().split(",");
                namen[i] = line[0];
                punten[i] = Double.parseDouble(line[1]);
            }
        }      
        catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }

        // bereken klasgemiddelde en toon verschil punten met klasgemiddelde
        // van iedere student
        double klasGemiddelde = berekenGemiddelde(punten);
        System.out.println("Klasgemiddelde: " + klasGemiddelde);
        System.out.println("----------------");
        
        for (int i = 0; i < namen.length; i++) {
            System.out.println(namen[i] + ": " + (punten[i] - klasGemiddelde));
        }
    }
}
