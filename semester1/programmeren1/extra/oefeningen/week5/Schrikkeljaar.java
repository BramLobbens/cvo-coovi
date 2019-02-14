/*
Week 5 - extra oefeningen
Oefening 3
*/
import java.io.*;

public class Schrikkeljaar {

    public static boolean isLeapYear(int year) {
        assert year >= 1583; // niet geldig vóór dit jaar
        return ((year % 4) == 0 && (year % 100) != 0) || (year % 400) == 0;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Geef een jaartal in: ");
        int year = Integer.parseInt(in.readLine());

        System.out.printf("%d is %s schrikkeljaar.\n",
                          year, isLeapYear(year) ? "een" : "geen");

    }
}
