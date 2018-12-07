/**
 * Programmeren 1 - 06/12
 */
public class Pizza {

    /**
     * print elementen van een array via sys.out 
     */
    public static void print(String[] vals) {
        for (String val : vals) System.out.println(val);
    }
    public static void main(String[] args) {
        
        String[] ingredienten = {"kaas", "tomatensaus", "pepers", "mozzarella"};
        print(ingredienten);
    }
}
