/*
Week 5 - Extra Oefeningen
Oefening 7
*/
import java.util.Scanner;

public class TekenRechthoek {

    public static void main(String[] args) {

        final int MAX = 20;
        
        Scanner reader = new Scanner(System.in);
        System.out.print("Geef de hoogte in: ");
        int hoogte = Integer.parseInt(reader.nextLine());
        System.out.print("Geef de breedte in: ");
        int breedte = Integer.parseInt(reader.nextLine());

        hoogte = hoogte > MAX ? MAX : hoogte;
        breedte = breedte > MAX ? MAX : breedte;

        do {
            for (int i = 0; i < breedte; i++)
                System.out.print('*');
            System.out.println();
        }
        while (--hoogte > 0);
    }
}
