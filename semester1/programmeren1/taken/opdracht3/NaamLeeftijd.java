/*
Programmeren 1 - Opdracht 3
Oefening 7 - NaamLeeftijd.java
*/
import java.io.*;
import java.util.Scanner;
import java.util.Calendar;

public class NaamLeeftijd {

    private String naam;
    private int geboortejaar;
        
    public static void main(String[] args) {
	/*
	  verkrijg naam
	  verkrijg geboortejaar
	  bereken leeftijd
	 */
	Scanner scanner = new Scanner(System.in);

	System.out.println("Geef naam: ");
	String naam = scanner.nextLine();
	System.out.println("Geef geboortejaar: ");
	int geboortejaar = scanner.nextInt();

	int jaar = Calendar.getInstance().get(Calendar.YEAR); // huidig jaar
	int leeftijd = jaar - geboortejaar;

	System.out.format("%s is %d jaar oud.\n", naam, leeftijd);
    }
}
