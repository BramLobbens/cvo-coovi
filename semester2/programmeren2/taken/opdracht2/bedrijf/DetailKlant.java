package bedrijf;

import java.util.Random;

public class DetailKlant extends Klant {
    
    private Random rand;

    public DetailKlant(String naam) {
        super(naam);
        this.rand = new Random();
    }

    @Override
    public double aankoopSom() {
        // verminder de totale aankoop min een willekeurig
        // gekozen bedrag
        double gratis = this.getBedragen()
                .get(rand.nextInt(this
                        .getBedragen()
                        .size()));
        return (double) Math.round((super.aankoopSom() - gratis) * 100.0) / 100.0;

    }
}
