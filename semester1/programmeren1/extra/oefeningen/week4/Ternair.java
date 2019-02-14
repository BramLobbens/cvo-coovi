/*
Week 4 - extra oefeningen
Oefening 8
*/
import java.util.Scanner;

public class Ternair {

    public static void main(String[] args) {

	Scanner reader = new Scanner(System.in);
	
	System.out.print("x: ");
	double x = reader.nextDouble();
	System.out.print("y: ");
	double y = reader.nextDouble();
	double z = x > y ? x : y;
	System.out.println("z = " + z);

	System.out.print("b? (true or false): ");
	boolean b = reader.nextBoolean();
	String s = b ? "april" : "maart";
	System.out.println("s = " + s);
    }
}
