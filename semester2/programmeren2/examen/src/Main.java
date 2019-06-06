import ui.UserInterface;
import vliegtuig.TransportVliegtuig;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        // maak een transportvliegtuig aan met een standaard vebruik van 30 l per vlieguur
        TransportVliegtuig dhlVliegtuig = new TransportVliegtuig(30);
        UserInterface ui = new UserInterface(reader, dhlVliegtuig);

        // vraag de gegevens op in een aparte klasse die de gegevens opvraagt
        ui.start();
    }
}
