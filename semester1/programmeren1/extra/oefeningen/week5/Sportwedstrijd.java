/*
Week 5 - Extra Oefeningen
Oefening 10
*/
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Sportwedstrijd {
    
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Geef aantal juryleden in: ");
        int n = Integer.parseInt(reader.nextLine());
       
        int[] scores = new int[n];
        Random rand = new Random();
        for (int i = 0; i < scores.length; i++) // use .length for arrays
            scores[i] = rand.nextInt(10) + 1;

        for (int score : scores)
            System.out.print(score + " ");
        System.out.println();

        int sum = 0;
        Arrays.sort(scores); // sort lowest to highest
        for (int i = 1; i < scores.length - 1; i++) // ignore lowest and highest score
            sum += scores[i];

        System.out.printf("Behaalde score: %d/10\n", sum / (n - 2));
    }
}
