import java.util.Random;
import java.util.Arrays;

/**
 * Programmeren 1 - Opdracht6
 * Oefening 3
 */
public class Temperatuur {

    private enum WeekDagen {Ma, Di, Wo, Do, Vr, Za, Zo};
    private static final int min = 10; // minimum temperatuur
    private static final int max = 25; // maximum temperatuur
    private static final int dagen = 7; // van maandag tot zondag
    private static final int metingen = 3; // voormiddag, namiddag en avond

    /**
     * bereken gemiddelde van een int array
     */
    private static double berekenGemiddelde(int[] vals) {
        double sum = 0.0;
        for (int val : vals) {
            sum += val;
        }
        return Math.round((sum / (vals.length)) * 100.0) / 100.0; // rond af tot 2 decimale plaatsen
    }

    public static void main(String[] args) {

        int[][] weekT = new int[dagen][metingen];
        Random rand = new Random();
        
        System.out.println("\tVM\tNM\tAV\t\tGem");
        for (int i = 0; i < 50; i++) System.out.print("-");
        System.out.println();
        for (int i = 0; i < weekT.length; i++) {

            System.out.print(WeekDagen.values()[i] + "\t");

            /* Vul random voor-, namiddag en avondtemperaturen in 
             * tussen min en max waardes en print de waardes uit.
             */     
            for (int j = 0; j < weekT[i].length; j++) {
                int temperatuur = rand.nextInt(max - min + 1) + min;
                weekT[i][j] = temperatuur;
                System.out.print(temperatuur + "\t");
            }
            System.out.print("|\t");

            /* Kopieer de gemeten weekdagtemperaturen in een nieuwe array.
             * Bereken en print het gemiddelde.
             */
            int[] dagT = Arrays.copyOf(weekT[i], weekT[i].length);
            System.out.println(berekenGemiddelde(dagT));
        }

        /* Maak een nieuwe array voor iedere gemeten ochtendtemperatuur.
         * Bereken en print het gemiddelde.
         */
        int[] ochtendT = new int[weekT.length];
        int j = 0; // kolom ochtendtemperatuur
        for (int i = 0; i < weekT.length; i++) {
            ochtendT[i] = weekT[i][j];
        }
        System.out.println("Gemiddelde ochtendtemperatuur is " + berekenGemiddelde(ochtendT));
    }
}
