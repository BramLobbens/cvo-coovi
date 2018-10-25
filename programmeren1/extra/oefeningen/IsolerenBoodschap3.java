/*
Oefening 9
versie 3
*/
public class IsolerenBoodschap3 {

    public static void main(String[] args) {

        String s1 = "Dit_is\\te_isoleren\\tekst";
        String s2 = "Deze_\\tekst_bevat:\\";
        
        String sList[] = {s1, s2};
        
        for (String s : sList) {
            int start = s.indexOf('\\');
            int end = s.lastIndexOf('\\');
            String slice = s.substring(start + 1, end);
            boolean hasColon = slice.contains(":");
            
            System.out.println("De originele tekst is: " + s);
            System.out.println("De geisoleerde tekst is: " + slice);
            System.out.print("De geisoleerde tekst bevat ");
            System.out.println(hasColon ? "een ':'" : "geen ':'\n");
        }
    }
}
