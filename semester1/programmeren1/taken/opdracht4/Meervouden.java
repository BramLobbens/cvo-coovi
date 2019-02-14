/*
Programmeren 1 - Opdracht 4
Oefening 8 - Meervouden.java
*/
import java.io.*;

public class Meervouden {

    public static void main(String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(isr);

        System.out.print("Geef een positief geheel getal: ");
        int n = Integer.parseInt(input.readLine());
        System.out.print("Geef maximumwaarde: ");
        final int MAX = Integer.parseInt(input.readLine());

        System.out.print("\t*2\t*3\t*4\n\t__\t__\t__\n");
        for (int i = 1; i <= n; i++) {
            if (i*4 > MAX) // if i*4 does not exceed bound, then neither will lower multiples.
                break;
            System.out.printf("%d\t%d\t%d\t%d\n", i, i*2, i*3, i*4);
        }
    }
}
