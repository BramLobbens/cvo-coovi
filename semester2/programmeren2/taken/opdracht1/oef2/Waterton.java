package oef2;

/**
 * Programmeren 2 - Opdracht1
 * Oefening 2
 */
public class Waterton {
    
    private double capaciteit; // max capaciteit liter
    private double inhoud; // huidige inhoud liter
    
    public Waterton(double capaciteit) {
        this(capaciteit, 0);
    }

    public Waterton(double capaciteit, double inhoud) {
        this.capaciteit = capaciteit;
        this.inhoud = inhoud;
    }
    
    // getters
    public double getCapaciteit() {
        return capaciteit;
    }
    
    public double getInhoud() {
        return inhoud;
    }
        
    // setters
    public void setCapaciteit(double capaciteit) {
        this.capaciteit = capaciteit;
    }
    
    public void setInhoud(double inhoud) {
        this.inhoud = inhoud;
    }
        
    /**
     * Vul waterton met hoeveelheid regenwater.
     * Als toegevoegde hoeveelheid de capaciteit overschrijdt,
     * return true, anders false;
     */
    public boolean opvangenWater(double hoeveelheid) {

        if (hoeveelheid > (capaciteit - inhoud)) {
            inhoud = capaciteit;
            return true; 
        }
        else {
            inhoud += hoeveelheid;
            return false;
        }
    }

    /**
     * Aantal af te tappen water (liter) mogelijk.
     * Als gevraagde hoeveelheid, de inhoud overschrijdt,
     * geef inhoud terug, anders de gevraagde hoeveelheid. 
     */
    public double aftappenWater(double hoeveelheid) {
        
        if (hoeveelheid > inhoud) {
            double afgetapt = inhoud;
            inhoud = 0;
            return afgetapt;
        }
        else {
            inhoud -= hoeveelheid;
            return hoeveelheid;
        }
    }
    
    @Override
    public String toString() {
        return "De waterton heeft een capaciteit van " + capaciteit +
            " liter, en een inhoud van " + inhoud + " liter.";
    }

}
