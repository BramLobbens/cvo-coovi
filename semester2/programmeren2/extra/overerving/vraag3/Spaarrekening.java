/*
 * Programmeren 2 - Extra Taken
 * TestSpaarrekening
 */
package vraag3;

class Spaarrekening implements Rekening {

    double saldo;
    double rentevoet;
    double voorlopigeIntrest;

    Spaarrekening(double saldo, double rentevoet) {
        this.saldo = saldo;
        this.rentevoet = rentevoet;
        voorlopigeIntrest = saldo * rentevoet;
    }

    Spaarrekening() {
        this(0, 0.05);
    }

    double getSaldo() {
        return saldo;
    }

    double getVoorlopigeIntrest() {
        return voorlopigeIntrest;
    }

    public void stort(double bedrag) {
        saldo += bedrag;
        voorlopigeIntrest += bedrag * rentevoet * Datum.jaarfractie;
    }

    public void trekTerug(double bedrag) {
        saldo -= bedrag;
        voorlopigeIntrest -= bedrag * rentevoet * Datum.jaarfractie;
    }

    /*
     * Deze methode mag slechts 1 keer per jaar, op 31 december
     * worden uitegevoerd.
     */
    void keerIntrestUit() {
        saldo += voorlopigeIntrest;
        voorlopigeIntrest = saldo * rentevoet;
    }
}
