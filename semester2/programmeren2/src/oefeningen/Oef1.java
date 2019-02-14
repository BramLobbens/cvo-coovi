package oefeningen;

import java.util.Scanner;

public class Oef1 {
	
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		System.out.print("Naam: ");
		String naam1 = reader.nextLine();
		System.out.print("Leeftijd: ");
		int leeftijd1 = Integer.parseInt(reader.nextLine());
		System.out.print("Naam: ");
		String naam2 = reader.nextLine();
		System.out.print("Leeftijd: ");
		int leeftijd2 = Integer.parseInt(reader.nextLine());
		reader.close();
		
		System.out.printf("%s is de oudste.\n", (leeftijd1 > leeftijd2) ? naam1 : naam2);
	}

}