package oef3;

/**
 * Programmeren 2 - Opdracht1
 * Oefening 3
 */
public class Auto {
    
    private double kilometers; // gereden kilometers
    private double brandstof; // inhoud brandstoftank
    private double inhoud; // max inhoud brandstoftank
    private double verbruik; // aantal l/100km
    
    public Auto(double kilometers, double brandstof,
                double inhoud, double verbruik) {
        this.kilometers = kilometers;
        this.brandstof = brandstof;
        this.inhoud = inhoud;
        this.verbruik = verbruik;
    }

    public Auto(double inhoud, double verbruik) {
        this(0.0, 0.0, inhoud, verbruik);
    }
    
    // getters
    public double getKilometers() {
        return kilometers;
    }
    
    public double getBrandstof() {
        return brandstof;
    }

    public double getInhoud() {
        return inhoud;
    }

    public double getVerbruik() {
        return verbruik;
    }
        
    // setters
    public void setKilometers(double kilometers) {
        this.kilometers = kilometers;
    }

    public void setBrandstof(double brandstof) {
        this.brandstof = brandstof;
    }
    
    public void setInhoud(double inhoud) {
        this.inhoud = inhoud;
    }

    public void setVerbruik(double verbruik) {
        this.verbruik = verbruik;
    }
        
    /**
     * Vul brandstoftank tot ze vol is.
     */
    public void vulTank() {
        if (brandstof == inhoud) {
            System.out.println("Brandstoftank is al vol.");
        }
        else {
            System.out.println((inhoud - brandstof) + "l " +
                "bijgetankt.");
            brandstof = inhoud;
        }
    }

    /**
     * Rij aantal kilometers.
     * Pas de afgelegde kilometers en brandstof aan
     * naargelang inhoud van de brandstoftank.
     */
    public void aantalKilometerRijden(double kilometers) {

        double brandstofNodig = (kilometers / 100 * verbruik);
        if (brandstofNodig > brandstof) {
            this.kilometers += (brandstof * 100 / verbruik);
            brandstof = 0;
        }
        else {
            this.kilometers += kilometers;
            brandstof -= brandstofNodig;
        }
    }
    
    @Override
    public String toString() {
        return "De auto heeft " + kilometers + " km " +
            "afgelegd en heeft " + brandstof + " l " +
            "over van de " + inhoud + " l.";
    }

}
