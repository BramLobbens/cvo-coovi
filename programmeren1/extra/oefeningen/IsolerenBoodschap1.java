/*
Oefening 9
versie 1
*/
public class IsolerenBoodschap1 {

    public static void main(String[] args) {

        String s1 = "Dit_is\\te_isoleren\\tekst";
        String s2 = "Deze_\\tekst_bevat:\\";
        
        String sList[] = {s1, s2};
        
        for (String s : sList) {
            
            String slice = "";
            boolean hasColon = false;
            boolean flag = false;
            int mark = 2;
            
            for (char c : s.toCharArray()) {
                if (c == '\\') {
                    flag = true;
                    mark--;
                    if (mark == 0)
                        flag = false;
                    continue;
                }
                if (flag) {
                    hasColon = (c == ':') ? true : false;
                    slice += Character.toString(c);
                }
            }
            
            System.out.println("De originele tekst is: " + s);
            System.out.println("De geisoleerde tekst is: " + slice);
            System.out.print("De geisoleerde tekst bevat ");
            System.out.println(hasColon ? "een ':'" : "geen ':'\n");
        }
    }
}
