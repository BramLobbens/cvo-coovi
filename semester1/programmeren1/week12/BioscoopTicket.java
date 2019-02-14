package bioscoop;

import java.io.IOException;
import java.util.Scanner;

public class BioscoopTicket {
	
	public static final double PRIJS = 10.99; // prijs van bioscoopticket
	
	/**
	 * Geef de selectie van de gebruiker terug van array films.
	 */
	public static String selecteerFilm(String[] films) throws ArrayIndexOutOfBoundsException {
		
		System.out.print("Selectie: ");
		Scanner reader = new Scanner(System.in);
		int input = Integer.parseInt(reader.nextLine());
		
		return films[input];
	}
	
	/**
	 * Bereken prijs met korting voor n aantal personen. 30% korting als jonger dan 15 jaar,
	 * 10% korting als ouder dan 65 jaar.
	 */
	public static double getKorting(int n, int leeftijd) {
		
		double korting = 0;
		if (leeftijd < 15) {
			korting = 0.30; // 30% korting
		}
		else if (leeftijd > 65) {
			korting = 0.10; // 10% korting
		}	
		return Math.round(n * (PRIJS - (PRIJS * korting)) * 100.0) / 100.0; // rond af tot twee decimale getallen
	}
	
	/**
	 * Vraag aantal tickets en leeftijd. Bereken op basis daarvan de totale prijs.
	 */
	public static double berekenTotPrijs() throws IOException {

			Scanner reader = new Scanner(System.in);
			System.out.print("Aantal tickets: ");
			int aantal = Integer.parseInt(reader.nextLine());
			if (aantal < 1) {
				throw new IOException("Je moet minstens 1 ticket kiezen.");
			}
			
			System.out.print("Leeftijd: ");
			int leeftijd = Integer.parseInt(reader.nextLine());
			if (leeftijd < 12) {
				throw new IOException("Je moet minstens 12 jaar zijn om een bioscoopticket te kopen.");
			}
			
			return getKorting(aantal, leeftijd);
	}

	public static void main(String[] args) {
		
		// Print selectie aan films
		System.out.println("Films die nu spelen. Maak je [selectie]");
		String[] films = {"Marry Poppins Returns", "Ralph Breaks the Internet", "Spider-Man: Into the Spider-Verse", "Bohemian Rhapsody"};
		for (int i = 0; i < films.length; i++) {
			System.out.println("[" + i + "] " + films[i]);
		}

		// Selecteer een film en bereken de prijs
		try {
			String film = selecteerFilm(films);
			Double totPrijs = berekenTotPrijs();
			
			Scanner reader = new Scanner(System.in);
			System.out.print("Naam: ");
			String naam = reader.nextLine();
			System.out.println("Film: " + film);
			System.out.println("Beste " + naam + ", uw bioscoopuitstap zal je " + totPrijs + " EUR kosten.");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Geen geldige selectie gemaakt. ");
			System.out.println("Actie afgebroken.");
		}
		catch (IOException ioe) {
			System.out.println(ioe.toString());
			System.out.println("Actie afgebroken.");
		}
		catch (Exception e) {
			System.out.println(e.toString());
			System.out.println("Actie afgebroken.");
		}
		
	}

}
