/*
Week 4 - extra oefeningen
Oefening 10
*/
import java.util.Scanner;

public class Klinker {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Geef een letter: ");
        char letter = (reader.nextLine().toCharArray())[0];
        boolean isVowel = !("aiueo".indexOf(letter) < 0);
        System.out.printf("Het karakter %c is %s klinker.\n", letter, isVowel ? "een" : "geen");
    }
}
