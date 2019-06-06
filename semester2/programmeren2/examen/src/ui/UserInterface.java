package ui;

import vliegtuig.TransportVliegtuig;
import java.util.Scanner;

public class UserInterface {

    private Scanner reader;
    private TransportVliegtuig vliegtuig;

    public UserInterface(Scanner reader, TransportVliegtuig vliegtuig) {
        this.reader = reader;
        this.vliegtuig = vliegtuig;
    }

    private void prompt() {
        System.out.println("Welkom bij je vlucht. Kies je optie:"
        + "\n[1] geef duurtijd vlucht in"
        + "\n[2] geef aantal liter kerosine per vlieguur (standaard 30.0 l)"
        + "\n[3] toon verbruik"
        + "\n[4] bereken prijs vlucht"
        + "\n[x] stop");
    }

    public void start() {
        prompt();

        while (true) {
            System.out.print("optie: ");
            String input = reader.nextLine();
            // stop de loop bij het ingeven van "x"
            if (input.toLowerCase().equals("x")) {
                break;
            }

            // roep de gepaste methodes op
            if (input.equals("1")) {
                System.out.print("duurtijd: ");
                int duurtijd = Integer.parseInt(reader.nextLine());
                vliegtuig.setDuurtijd(duurtijd);
            }

            else if (input.equals("2")) {
                System.out.print("liter per vlieguur: ");
                double liter = Double.parseDouble(reader.nextLine());
                // setKerosinePerVlieguur throwt een error wanneer dit minder is dan 20 l
                try {
                    vliegtuig.setKerosinePerVlieguur(liter);
                }
                catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }

            else if (input.equals("3")) {
                // controleer eerst ofdat er een duurtijd bestaat
                if (!vliegtijdIngegeven()) {
                    System.out.println("Vul eerst je vliegtijd in");
                }
                else {
                    System.out.println("Totaal verbruik is: " + vliegtuig.totaalVebruik());
                }
            }

            else if (input.equals("4")) {
                // controleer eerst ofdat er een duurtijd bestaat
                if (!vliegtijdIngegeven()) {
                    System.out.println("Vul eerst je vliegtijd in");
                }
                else {
                    double prijs = vliegtuig.berekenPrijs();
                    System.out.println("Prijs: " + prijs + " euro");
                }
            }
        }
    }
    private boolean vliegtijdIngegeven() {
        return vliegtuig.getDuurtijd() != 0;
    }
}
