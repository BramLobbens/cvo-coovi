import java.util.Random;
import java.util.Map;
import java.util.HashMap;

/**
 * Programmeren 1 - Opdracht6
 * Oefening 2
 */
public class FrequentietabelLengte {

    
    public static void main(String[] args) {

        // aantal studenten
        final int NUM = 1000;
        // veronderstel studenten tussen lower- en upperbound lengte (cm)
        final int upperbound = 200;
        final int lowerbound = 150;

        /* Maak een map van random gemeten lengtes (key) en hun frequentie (value)
         * tussen lower- en upperbound.
         * Voeg een nieuwe lengte toe met frequentie nul als die nog niet bestaat.
         * Anders, vermeerder de frequentie met één.
         */
        Map<Integer, Integer> map = new HashMap<>();
        Random rand = new Random();
        for (int i = 0; i < NUM; i++) {
            int lengte = rand.nextInt(upperbound - lowerbound + 1) + lowerbound;
            map.putIfAbsent(lengte, 0);
            map.put(lengte, map.get(lengte) + 1);
        }

        for (int lengte : map.keySet()) {
            System.out.println(lengte + "cm -> " + map.get(lengte) + " studenten");
        }
    }
}
