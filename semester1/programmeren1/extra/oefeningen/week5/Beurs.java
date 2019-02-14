/*
Week 5 - Extra Oefeningen
Oefening 11
*/
import java.util.Scanner;

public class Beurs {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int countM = 0, countF = 0;
        boolean on = true;
        while (on) {
            System.out.print("input: ");
            String count = reader.nextLine();
            switch (count) {
            case "m":
                countM++;
                break;
            case "v":
                countF++;
                break;
            case "s":
                on = false; // turn off
                break;
            default:
                // empty
            }
        }

        System.out.printf("m: %d, v: %d\n", countM, countF);
    }
}
