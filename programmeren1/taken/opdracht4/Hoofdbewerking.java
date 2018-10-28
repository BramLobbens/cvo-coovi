/*
Programmeren 1 - Opdracht 4
Oefening 2 - Hoofdbewerking.java
*/
import java.io.*;

public class Hoofdbewerking {

    public static void main(String[] args) throws IOException, IllegalArgumentException {
    
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(isr);
        System.out.println("Geef het eerste getal in: ");
        double n = Double.parseDouble(input.readLine());
        System.out.println("Geef het tweede getal in: ");
        double m = Double.parseDouble(input.readLine());
        System.out.println("Geef de gewenste bewerking in (+,-,*,/): ");
        char op = (char) input.read(); // safer with Scanner

        double result;
        switch (op) {
        case '+':
            result = n + m;
            break;
        case '-':
            result = n - m;
            break;
        case '*':
            result = n * m;
            break;
        case '%':
            result = n % m;
            break;
        case '/':
            if (m != 0) {
                result = n / m;
                break;
            }
            throw new IllegalArgumentException("Deler is 0");
        default:
            throw new IllegalArgumentException("Onbekende bewerking.");
        }

        System.out.println("Resultaat: " + result);
    }
}
