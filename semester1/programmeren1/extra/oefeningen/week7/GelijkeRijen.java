import java.util.Arrays;

/**
 * Week 7 - Extra Oefeningen
 * Oefening 3
 */
public class GelijkeRijen {
    
    private static boolean isEqual(boolean[] xs, boolean[] ys) {
        
        for (int i = 0; i < xs.length; i++) {
            if (xs[i] == ys[i]) {
                continue;
            }
            else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        
        boolean[] rijA = {true, true, false, false, true, false, true, true, true};
        boolean[] rijB = {true, true, false, false, true, false, true, true, true};
        boolean[] rijC = {true, true, false, false, true, false, true, true, false};
        
        /* java native implementation */
        boolean result1 = Arrays.equals(rijA, rijB);
        boolean result2 = Arrays.equals(rijA, rijC);
        System.out.printf("De rijen a en b zijn %s\n", result1 ? "gelijk" : "niet gelijk");
        System.out.printf("De rijen a en c zijn %s\n", result2 ? "gelijk" : "niet gelijk");
        System.out.println();
        
        /* own implementation */
        boolean result3 = isEqual(rijA, rijB);
        boolean result4 = isEqual(rijA, rijC);
        System.out.printf("De rijen a en b zijn %s\n", result3 ? "gelijk" : "niet gelijk");
        System.out.printf("De rijen a en c zijn %s\n", result4 ? "gelijk" : "niet gelijk");
    }
}
