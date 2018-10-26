/*
Oefening 11
versie 1
*/
import java.util.Scanner;
import java.util.stream.DoubleStream;

public class Eindcijfer1 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Geef deel 1 (op 20): ");
        double deel1 = Double.parseDouble(reader.nextLine());
        System.out.print("Geef deel 2 (op 20): ");
        double deel2 = Double.parseDouble(reader.nextLine());
        System.out.print("Geef deel 3 (op 20): ");
        double deel3 = Double.parseDouble(reader.nextLine());
        System.out.print("Geef deel 4 (op 20): ");
        double deel4 = Double.parseDouble(reader.nextLine());

        deel1 *= 0.15;
        deel2 *= 0.25;
        deel3 *= 0.20;
        deel4 *= (1 - (0.15 + 0.25 + 0.20));
        double[] scores = {deel1, deel2, deel3, deel4};
        double totaal = DoubleStream.of(scores).sum();

        System.out.printf("Het totaalcijfer van de student: %.2f/20\n", totaal);
    }
}
