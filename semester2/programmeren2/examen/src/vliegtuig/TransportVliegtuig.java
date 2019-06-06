package vliegtuig;

public class TransportVliegtuig extends Vliegtuig {

    /* Kost kerosine transportvliegtuig is 2 euro per liter */
    private final int KOST = 2;

    public TransportVliegtuig(double kerosinePerVlieguur) {
        this(kerosinePerVlieguur, 0);
    }

    public TransportVliegtuig(double kerosinePerVlieguur, int duurtijd) {
        super(kerosinePerVlieguur, duurtijd);
    }

    // transportvliegtuig berekent met een vaste kost van 2 euro per liter
    public double berekenPrijs() {
        return super.getDuurtijd() * super.getKerosinePerVlieguur() * KOST;
    }
}
