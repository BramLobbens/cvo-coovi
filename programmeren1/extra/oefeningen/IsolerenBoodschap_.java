/*
Oefening 9
Slechte oplossing
*/
public class IsolerenBoodschap_ {

    public static void main(String[] args) {

	String s1 = "Dit_is\\te_isoleren\\tekst";
	String s2 = "Deze_\\tekst_bevat:\\";
	String slice1 = "";
	String slice2 = "";
	boolean hasColon1 = false;
	boolean hasColon2 = false;
	
	boolean flag = false;
	int mark = 2;
	for (char c : s1.toCharArray()) {
	    if (c == '\\') {
		flag = true;
		mark--;
		if (mark == 0)
		    flag = false;
		continue;
	    }
	    if (flag) {
		hasColon1 = (c == ':') ? true : false;
		slice1 += Character.toString(c);
	    }
	}
	
	System.out.println("De originele tekst is: " + s1);
	System.out.println("De geisoleerde tekst is: " + slice1);
	System.out.print("De geisoleerde tekst bevat ");
	System.out.println(hasColon1 ? "een ':'" : "geen ':'\n");
	
	flag = false;
	mark = 2;
	for (char c : s2.toCharArray()) {
	    if (c == '\\') {
		flag = true;
		mark--;
		if (mark == 0)
		    flag = false;
		continue;
	    }
	    if (flag) {
		hasColon1 = (c == ':') ? true : false;
		slice2 += Character.toString(c);
	    }
	}
	
	System.out.println("De originele tekst is: " + s2);
	System.out.println("De geisoleerde tekst is: " + slice2);
	System.out.print("De geisoleerde tekst bevat ");
	System.out.println(hasColon2 ? "een ':'" : "geen ':'\n");
    }
}
