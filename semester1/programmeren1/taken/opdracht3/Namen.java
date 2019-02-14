/*
Programmeren 1 - Opdracht 3
Oefening 5 - Namen.java
*/
import java.io.*;
import java.util.Scanner;

public class Namen {

    private String voornaam, familienaam;
    
    public static void main(String[] args) {
	/*
	  verkrijg voornaam en familienaam van user
	  concat voornaam en familienaam en print
	  print aantal chars voor-, achter-, en volledige naam
	 */
	Scanner scanner = new Scanner(System.in);

	System.out.println("Geef voornaam: ");
	String voornaam = scanner.nextLine();
	System.out.println("Geef familienaam: ");
	String familienaam = scanner.nextLine();

	String naam = voornaam.concat(" ").concat(familienaam); //of: voornaam + " " + familienaam;
	int lengte_naam = naam.length();
	int lengte_vn = voornaam.length();
	int lengte_fn = familienaam.length();

	System.out.println("Volledige naam: " + naam);
	System.out.format("Aantal karakters:\nVoornaam: %d\nFamilienaam: %d\n" +
			  "Volledige naam: %d\n",
			  lengte_vn, lengte_fn, lengte_naam);
    }
}
