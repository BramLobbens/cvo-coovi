package vliegtuig;

public class Vliegtuig {

    private double kerosinePerVlieguur;
    private int duurtijd;

    // constructors
    public Vliegtuig(double kerosinePerVlieguur) {
        this.kerosinePerVlieguur = kerosinePerVlieguur;
        this.duurtijd = 0;
    }

    public Vliegtuig(double kerosinePerVlieguur, int duurtijd) {
        this.kerosinePerVlieguur = kerosinePerVlieguur;
        this.duurtijd = duurtijd;
    }

    // getters en setters
    public double getKerosinePerVlieguur() {
        return kerosinePerVlieguur;
    }

    public int getDuurtijd() {
        return duurtijd;
    }

    public void setKerosinePerVlieguur(double kerosinePerVlieguur) {
        if (kerosinePerVlieguur < 20) {
            throw new IllegalArgumentException("Kan niet minder zijn dan 20");
        }
        else {
            this.kerosinePerVlieguur = kerosinePerVlieguur;
        }
    }

    public void setDuurtijd(int duurtijd) {
        this.duurtijd = duurtijd;
    }

    // overige methodes
    public double totaalVebruik() {
        return kerosinePerVlieguur * duurtijd;
    }

    public double berekenPrijs(int kostKerosine) {
        return this.duurtijd * this.kerosinePerVlieguur * kostKerosine;
    }

}
