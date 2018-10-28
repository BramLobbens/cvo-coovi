/*
FizzBuzz
*/

public class FizzBuzz {

    private static int count = 100;
    
    public static void main(String[] args) {

	for (int i = 0; i < count; ++i) {

	    if (i % 5 == 0 && i % 3 == 0) {
		System.out.println("fizzbuzz");
	    }
	    else if (i % 5 == 0) {
		System.out.println("fizz");
	    }
	    else if (i % 3 == 0) {
		System.out.println("buzz");
	    }
	    else {
		System.out.println(i);
	    }
	}
    }
}
