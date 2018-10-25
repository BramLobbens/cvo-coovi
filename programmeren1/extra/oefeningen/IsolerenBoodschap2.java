/*
Oefening 9
versie 2
*/
public class IsolerenBoodschap2 {

    public static void main(String[] args) {

        String s1 = "Dit_is\\te_isoleren\\tekst";
        String s2 = "Deze_\\tekst_bevat:\\";
        
        String sList[] = {s1, s2};
        
        for (String s : sList) {
            int start = s.indexOf('\\');
            String sReverse =  new StringBuilder(s).reverse().toString();
            int end = s.length() - sReverse.indexOf('\\');
            String slice = s.substring(start + 1, end - 1);
            boolean hasColon = slice.contains(":");
            
            System.out.println("De originele tekst is: " + s);
            System.out.println("De geisoleerde tekst is: " + slice);
            System.out.print("De geisoleerde tekst bevat ");
            System.out.println(hasColon ? "een ':'" : "geen ':'\n");
        }
    }
}
