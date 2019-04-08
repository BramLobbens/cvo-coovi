package bedrijf;

public class Groothandelaar extends Klant {

    private double korting;

    public Groothandelaar(String naam, double korting) {
        super(naam);
        this.korting = korting;
    }

    public Groothandelaar(String naam) {
        // Geef 10% standaardkorting
        this(naam, 0.10);
    }

    @Override
    public double aankoopSom() {
        return (double) Math.round(super.aankoopSom() * (1 - korting) * 100.0) / 100.0;
    }
    
}
