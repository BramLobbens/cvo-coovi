/*
Week 5 - Extra Oefeningen
Oefening 12
*/
import java.util.Scanner;
import java.util.Random;

public class Raadsel {

    public static void main(String[] args) {

        Random rand = new Random();
        int n = rand.nextInt(500) + 1;

        System.out.println("Doe een gok tussen 1 en 500.");
        
        Scanner reader = new Scanner(System.in);
        int tries = 0;
        int guess;
        boolean stop = false;
        while (!stop) {
            
            guess = Integer.parseInt(reader.nextLine());
            tries++;
            
            if (guess == n) {
                System.out.printf("Geraden in %d pogingen!\n", tries);
                stop = true;
            }
            else if (tries > 9) {
                System.out.println("Spijtig. Geen pogingen meer over.");
                stop = true;
            }
            else if (guess < n) {
                System.out.println("Gok hoger");
            }
            else if (guess > n) {
                System.out.println("Gok lager");
            }
        }
    }
}
