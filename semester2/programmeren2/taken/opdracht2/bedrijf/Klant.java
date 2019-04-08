package bedrijf;

import java.util.ArrayList;
import java.util.List;

public class Klant {
    
    private String naam;
    private List<Double> bedragen;
    private static int aantal = 0;

    public Klant(String naam) {
        this.naam = naam;
        bedragen = new ArrayList<>();
        aantal++; // incrementeer aantal klanten
    }

    public static int getAantal() {
        return aantal;
    }

    public List<Double> getBedragen() {
        return bedragen;
    }

    public void aankoop(double bedrag) {
        bedragen.add(bedrag);
    }
    
    public double aankoopSom() {
        double sum = 0.0;
        for (double bedrag : bedragen) {
            sum += bedrag;
        }
        return (double) Math.round(sum * 100.0) / 100.0;
    }

    @Override
    public String toString() {
        return naam + ", aankoopsom: " + aankoopSom();
    }
}
