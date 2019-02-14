/*
Week 4 - extra oefeningen
Oefening 4
willekeurig natuurlijk getal in het bereik [1,10]
*/
public class WillekeurigGetal {

    static int randomWithRange(int min, int max) {

	    int range = (max - min) + 1;
	    return (int) (Math.random() * range) + min;
    }
    
    public static void main(String[] args) {

	//(1)
	System.out.println((int) (Math.random() * 10) + 1);

	//(2)
	System.out.println(randomWithRange(1, 10));
    }
}
