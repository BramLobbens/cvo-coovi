/*
Oefening 10
versie 2
*/
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.DoubleStream;

public class Eindcijfer2 {

    public static void main(String[] args) {

        List<Double> scores = new ArrayList<Double>();
        double[] mod = {0.15, 0.25, 0.20, 0.40};
        
        Scanner reader = new Scanner(System.in);
        System.out.print("Geef deel 1 (op 20): ");
        double deel1 = Double.parseDouble(reader.nextLine());
        scores.add(deel1);
        System.out.print("Geef deel 2 (op 20): ");
        double deel2 = Double.parseDouble(reader.nextLine());
        scores.add(deel2);
        System.out.print("Geef deel 3 (op 20): ");
        double deel3 = Double.parseDouble(reader.nextLine());
        scores.add(deel3);
        System.out.print("Geef deel 4 (op 20): ");
        double deel4 = Double.parseDouble(reader.nextLine());
        scores.add(deel4);

        int i = 0;
        double totaal = 0;
        for (double score : scores) {
            score *= mod[i];
            totaal += score;
            i++;
        }
        
        System.out.printf("Het totaalcijfer van de student: %.2f/20\n", totaal);
    }
}
