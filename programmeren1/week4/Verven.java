import java.io.*;
import java.util.Scanner;
import java.util.Locale;

public class Verven {

    private double hoogte, breedte, lengte;
    private int lagen; // lagen verf
    private static final float VERF = 0.5f; // liter verf per vierkante meter

    public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
	scanner.useLocale(Locale.US);

	System.out.println("hoogte? ");
	double hoogte = scanner.nextDouble();
	
	System.out.println("breedte? ");
	double breedte = scanner.nextDouble();
	
	System.out.println("lengte? ");
	double lengte = scanner.nextDouble();
	
	System.out.println("lagen? ");
	int lagen = scanner.nextInt();

	double oppervlakte = (lengte * breedte) +
	    (hoogte * breedte * 2) +
	    (hoogte * lengte * 2);

	double liter = oppervlakte * lagen * VERF;

	System.out.format(Locale.ROOT, "Voor %.2fm2 heb je %.2f liter verf" +
			  "nodig voor %d lagen.\n",
			  oppervlakte, liter, lagen);
    }
}
