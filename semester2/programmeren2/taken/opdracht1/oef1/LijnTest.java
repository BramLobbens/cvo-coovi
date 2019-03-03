package oef1;

/**
 * Programmeren 2 - Opdracht1
 * Oefening 1
 */
public class LijnTest {
        
    public static void main(String[] args) {

        Lijn ab = new Lijn();
        ab.maakDikker();
        int x = ab.getBeginX();
        ab.setEindX(x);
        System.out.println(ab.toString());

        Lijn cd = new Lijn();
        cd.setDikte(5);
        System.out.println(cd.toString());
    }
}
