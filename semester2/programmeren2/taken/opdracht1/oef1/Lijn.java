package oef1;

/**
 * Programmeren 2 - Opdracht1
 * Oefening 1
 */
public class Lijn {

    // lijndikte
    private int dikte;

    // coordinaten beginpunt
    private int beginX;
    private int beginY;

    // coordinaten eindpunt
    private int eindX;
    private int eindY;
    
    public Lijn() {
        this(1, 0, 0, 1024, 1024);
    }

    public Lijn(int dikte, int beginX, int beginY, int eindX, int eindY) {
        this.dikte = dikte;
        this.beginX = beginX;
        this.beginY = beginY;
        this.eindX = eindX;
        this.eindY = eindY;
    }
    
    // getters
    public int getDikte() {
        return dikte;
    }
    
    public int getBeginX() {
        return beginX;
    }
    
    public int getBeginY() {
        return beginY;
    }
    
    public int getEindX() {
        return eindX;
    }
    
    public int getEindY() {
        return eindY;
    }
    
    // setters
    public void setDikte(int dikte) {
        this.dikte = dikte;
    }
    
    public void setBeginX(int beginX) {
        this.beginX = beginX;
    }
    
    public void setBeginY(int beginY) {
        this.beginY = beginY;
    }
    
    public void setEindX(int eindX) {
        this.eindX = eindX;
    }
    
    public void setEindY(int eindY) {
        this.eindY = eindY;
    }
    
    /**
     * Maak lijn met 1px dunner.
     */
    public void maakDunner() {
        setDikte(getDikte() - 1);
    }

    /**
     * Maak lijn met 1px dikker.
     */
    public void maakDikker() {
        setDikte(getDikte() + 1);
    }
    
    @Override
    public String toString() {
        return "Lijn begint op (" + beginX + ", " + beginY +
            "), lijn eindigt op (" + eindX + ", " + eindY +
            ") en heeft dikte van " + dikte + " pixels.";
    }

}
