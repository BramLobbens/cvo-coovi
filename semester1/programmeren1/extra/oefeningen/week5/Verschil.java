/*
Week 5 - Extra Oefeningen
Oefening 9
*/
import java.util.Scanner;

public class Verschil {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Geef positief getal: ");
        int n = Integer.parseInt(reader.nextLine());
        int m = n;
        while ( m != -1) {
            
            System.out.println("Kleinste getal = " + (n < m ? n : m));
            System.out.println("Grootste getal = " + (n > m ? n : m));
            System.out.println("Verschil = " + Math.abs(n - m));

             System.out.print("Geef positief getal: ");
             m = Integer.parseInt(reader.nextLine());

             if (m > n)
                 n += (m - (m = n));
             /* // more readable swap
             if (m > n) {
                 int tmp = n;
                 n = m;
                 m = tmp;
                 }*/
        }
    }
}
