/*
Week 5 - Extra Oefeningen
Oefening 5
*/
import java.util.Scanner;

public class AantalDagen {
    
    public static boolean isLeapYear(int year) {
        assert year >= 1583; // niet geldig vóór dit jaar
        return ((year % 4) == 0 && (year % 100) != 0) || (year % 400) == 0;
    }
    
    public static int numberOfDays(int yearStart, int yearEnd) {
        int days = 0;
        for (int year = yearStart; year <= yearEnd; year++) {
            days = isLeapYear(year) ? days + 366 : days + 365;
        }
        return days;
    }
    
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Geef twee jaartallen (jaar jaar): ");
        int y1 = reader.nextInt();
        int y2 = reader.nextInt();
        
        System.out.printf("Aantal dagen in de periode [%d,%d] = %d\n",
                          y1, y2, numberOfDays(y1, y2));
    }
}
