import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Collections;
import java.text.Collator;
import java.util.Locale;

/* Programmeren 1 - Extra Oefeningen
 * Oefening 11
 */
public class AlfabetischEerste {

    public static void main(String[] args) {

        List<String> namen = Arrays.asList("Jihane", "Gershon", "Karine", "Mark", "Renaat", "Imane", "Frederik",
                                           "Ronald", "Wouter", "David");
        // methode 1
        List<String> sortedNamen = namen.stream().sorted().collect(Collectors.toList());
        //sortedNamen.stream().forEach(System.out::println);

        // methode 2 - does not take accents into account
        Collections.sort(namen);
        System.out.println(namen);

        // methode 3 - takes accents into account based on locale
        Collections.sort(namen, Collator.getInstance(new Locale("nl")));
        System.out.println(namen);

        // methode 4
        String first = namen.get(0);
        for (String naam : namen) {
            if (first.compareTo(naam) > 0) {
                first = naam;
            }
        }
        System.out.println("Eerste alfabetische naam: " + first);
    }
}
