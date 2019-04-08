package groenten;

public class Komkommer extends Groente implements Kleur {
    
    private String kleur;
    private String smaak;
    
    public Komkommer(String soort, String kleur, String smaak) {
        super(soort);
        this.kleur = kleur;
        this.smaak = smaak;
    }
    
    @Override
    public void heeftKleur() {
        System.out.print(kleur);
    }
    
    @Override
    public void heeftSmaak() {
        System.out.print(smaak);
    }
    
    @Override
    public String getSoort() {
        return super._getSoort();
    }
}
