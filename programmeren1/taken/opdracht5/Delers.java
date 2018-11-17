import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.IntStream;

/**
 * Programmeren 1 - Opdracht 5
 * Oefening 2 - Delers.java
 */
public class Delers {

    /**
     * Geef een lijst terug van alle delers die opgaan.
     * versie 1
     */
    public static List<Integer> divisorsOf(int n) {

        List<Integer> xs = new ArrayList<>();
        for (int i = 1; i <= n; i++)
            if (n % i == 0) {
                xs.add(i);
        }
        return xs;
    }

    /**
     * Geef een lijst terug van alle delers die opgaan.
     * versie 2
     */
    public static IntStream divisorsOf_(int n) {
        return IntStream.rangeClosed(1, n).filter(i -> n % i == 0);
    }
    
    public static void main(String[] args) {

        System.out.print("Voer een positief geheel getal in: ");
        Scanner reader = new Scanner(System.in);
        int num = Integer.parseInt(reader.nextLine());

        System.out.printf("De delers van het getal %d zijn: ", num);

        // methode 1
        for (int i = 1; i <= num; i++) {
            if (num % i == 0)
                System.out.print(i + " ");
        }
        System.out.println();
        
        // methode 2
        for (int x : divisorsOf(num))
            System.out.print(x + " ");
        System.out.println();

        // methode 3
        divisorsOf_(num).forEach(x -> System.out.print(x + " "));
        System.out.println();
    }
}
