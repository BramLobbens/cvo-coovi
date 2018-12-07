import java.util.Random;

/**
 * Programmeren 1 - Opdracht6
 * Oefening 2 - versie 2 met arrays
 */
public class FrequentietabelLengte2 {
    
    public static void main(String[] args) {

        // aantal studenten
        final int NUM = 1000;
        // veronderstel studenten tussen lower- en upperbound lengte (cm)
        final int upperbound = 200;
        final int lowerbound = 150;

        /* Maak een array 'metingen' van random gemeten lengtes tussen lower- en
         * upperbound.
         * Maak een array 'frequenties' van lengte [upperbound - lowerbound] en
         * vermeerder elke positie met één door de gemeten lengte als index te
         * gebruiken.
         */
        int[] metingen = new int[NUM]; // NUM random metingen
        int[] frequenties = new int[upperbound - lowerbound + 1]; // histogram voor de metingen
        Random rand = new Random();
        for (int i = 0; i < metingen.length; i++) {
            metingen[i] = rand.nextInt(upperbound - lowerbound + 1) + lowerbound;
            frequenties[metingen[i] - lowerbound] += 1;
        }

        for (int i = 0; i < frequenties.length; i++) {
            System.out.println((i + lowerbound) + "cm -> " + frequenties[i] + " studenten");
        }
    }
}
