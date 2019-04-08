package groenten;

public abstract class Groente {

    private String soort;
    
    public Groente(String soort) {
        this.soort = soort;
    }
    
    public abstract String getSoort();
    
    // als een attribuut in de superclass gebruikt wordt,
    // moet deze te bereiken zijn in de subclass met een getter
    public String _getSoort() {
        return soort;
    }
}
