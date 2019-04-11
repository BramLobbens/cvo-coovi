/*
 * Programmeren 2 - Extra Taken
 * Vraag 7
 */
package vraag7;

public class Artikel {

    private String naam;
    private int nettoPrijs;
    private double percentBTW; // uitgedrukt als een getal tussen 0.0 en 100.0

    public Artikel(String naam, int nettoPrijs, double percentBTW) {
        this.naam = naam;
        this.nettoPrijs = nettoPrijs;
        this.percentBTW = percentBTW;
    }

    public String getNaam() {
        return naam;
    }
    
    public double getPrijsInclusiefBTW() {
        return nettoPrijs * (1 + (percentBTW / 100));
    }
}
