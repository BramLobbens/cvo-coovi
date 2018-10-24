/*
Oefening 6
*/
import java.util.Scanner;

public class StringTest {
    
    public static void main(String[] args) {

	char letter = 'a';
	int pos = 0;
	int last;
	String verkort;
	Scanner reader = new Scanner(System.in);
	System.out.printf("Geef een string in met een letter '%c': ", letter);
	String s = reader.nextLine();

	// positie van de tweede letter 'letter'
	int count = 0;
	for (char c : s.toCharArray()) {
	    if (c == letter) // char is a primitive so can use '=='
		count++;
	    if (count == 2)
		break;
	    pos++;
	}
	
	// tekst zonder begin -en eindletter
	last = s.length() - 1;
	verkort = s.substring(1,last);
	
	System.out.println("Mijn volledige teksts is: " + s);
	System.out.printf("De positie van de tweede letter '%c' is: %d\n",
			  letter, pos);
	System.out.println("De tekst zonder begin- en eindletter is: "
			   + verkort);
    }
}
