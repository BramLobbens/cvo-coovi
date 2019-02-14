/*
Programmeren 1 - Opdracht 3
Oefening 3 - Hypotenusa.java
*/
import java.io.*;
import java.util.Scanner;
import java.lang.Math.*; // sqrt() en pow()

public class Hypotenusa {

    private double a, b;
    
    public static void main(String[] args) {
	/*
	  verkrijg lengte zijde a
	  verkrijg lengte zijde b
	  c^2 = a^2 + b^2
	 */
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("geef waarde 'a': ");
	double a = scanner.nextDouble();
	System.out.println("geef waarde 'b': ");
	double b = scanner.nextDouble();

	double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
	System.out.format("De lengte van de schuine zijde is: %.2f\n", c);
    }
}
