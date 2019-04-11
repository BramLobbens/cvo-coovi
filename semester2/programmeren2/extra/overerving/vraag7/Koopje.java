/*
 * Programmeren 2 - Extra Taken
 * Vraag 7
 */
package vraag7;

public class Koopje extends Artikel {

    private double percentKorting; // uitgedrukt als een getal tussen 0.0 en 100.0

    public Koopje(String naam, int nettoPrijs, double percentBTW, double percentKorting) {
        super(naam, nettoPrijs, percentBTW);
        this.percentKorting = percentKorting;
    }

    public double getPrijsInclusiefBTW() {
        return super.getPrijsInclusiefBTW() * (100 - percentKorting) / 100;
    }
}
