/*
 * Programmeren 2 - Extra Taken
 * TestSpaarrekening
 */
package vraag3;

public class TestSpaarrekening {

    public static void main(String[] args) {

        /*
         * Maakt nieuwe rekening met rentevoet 0.05 en
         * geen beginsaldo.
         */
        Spaarrekening mijnRekening = new Spaarrekening();

        /*
         * Verrichtingen
         */
        // 1 jan
        Datum.jaarfractie = 1.0;
        mijnRekening.stort(1000);
        // 1 jul
        Datum.jaarfractie = 6.0/12.0;
        mijnRekening.stort(1000);
        // 1 okt
        Datum.jaarfractie = 3.0/12.0;
        mijnRekening.trekTerug(1000);
        // 1 dec
        Datum.jaarfractie = 1.0/12.0;
        mijnRekening.stort(5000);

        /*
         * Toon resultaat op 31 december.
         */
        mijnRekening.keerIntrestUit();
        System.out.println("Saldo: " + mijnRekening.getSaldo());
    }
}
