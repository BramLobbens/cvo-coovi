package hotel;

public class Hotel {

    private String naam;
    private double prijsKamer;
    private int overnachtingen;

    Hotel(String naam, double prijsKamer, int overnachtingen) {
        this.naam = naam;
        this.prijsKamer = prijsKamer;
        this.overnachtingen = overnachtingen;
    }

    public String getNaam() {
        return naam;
    }

    public double getPrijsKamer() {
        return prijsKamer;
    }

    public int getOvernachtingen() {
        return overnachtingen;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setPrijsKamer(double prijsKamer) {
        this.prijsKamer = prijsKamer;
    }

    public void setOvernachting(int overnachtingen) {
        this.overnachtingen = overnachtingen;
    }
    
    /*
     * Bereken de totale prijs van alle overnachtingen.
     */
    public double prijsOvernachtingen() {
        return prijsKamer * overnachtingen;
    }

    @Override
    public String toString() {
        return naam + " is een hotel met een kamerprijs van " +
            prijsKamer + ".";
    }
}
