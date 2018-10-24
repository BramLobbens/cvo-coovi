/*
Oefening 2
*/
/* java.lang.Math not necessary
java.lang included by default */
// import java.io.*; System.out comes from java.lang
import java.util.Scanner;

public class MathTest {

    public static void main(String[] args) {
	//(1) a / (a + x^2)
	//(2) (1/3) * pi * r^3
	//(3) (a + b)^(5 * a * c)

	double a, b, c, x, r;
	Scanner reader = new Scanner(System.in);
	System.out.printf("Geef 'a': ");
	a = reader.nextDouble();
	
	System.out.printf("Geef 'b': ");
	b = reader.nextDouble();
	
	System.out.printf("Geef 'c': ");
	c = reader.nextDouble();
	
	System.out.printf("Geef 'x': ");
	x = reader.nextDouble();
	
	System.out.printf("Geef 'r': ");
	r = reader.nextDouble();
	
	//(1)
	double resultaat1 = a / (a + Math.pow(x, 2));
	System.out.printf("a / (a + x^2) -> ");
	System.out.println(resultaat1);
	//(2)
	double resultaat2 = (1/3) * Math.PI * Math.pow(r, 2);
	System.out.printf("(1/3) * pi * r^3 -> ");
	System.out.println(resultaat2);
	//(3)
	double resultaat3 = Math.pow((a + b), (5 * a * c));
	System.out.printf("(a + b)^(5 * a * c) -> ");
	System.out.println(resultaat3);
    }
}
