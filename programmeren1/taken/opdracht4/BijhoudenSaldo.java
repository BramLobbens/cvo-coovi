/*
Programmeren 1 - Opdracht 4
Oefening 6 - BijhoudenSaldo.java
*/
import java.io.*;

public class BijhoudenSaldo {

    public static void main(String[] args) throws IOException {
        
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(isr);
                
        final int MAX = 1000000; // bovenlimiet saldo
        int saldo = 0; // beginsaldo

        System.out.println("Beheer banksaldo");
        
        do {
            System.out.println("Voer operatie in: ");
            int bedrag = Integer.parseInt(input.readLine());
            saldo += bedrag;
            System.out.println("Nieuw saldo: " + saldo);
        }
        while (saldo > 0 && saldo < MAX);
        
        System.out.printf("%s. Rekening afgesloten.\n",
                          saldo < 0 ? "Saldo negatief" : "Limiet bereikt");
        
    }
}
