/*
 * Programmeren 2 - Extra Taken
 * Vraag 8
 */
package vraag8;

class Cirkel extends Vorm {

    double r; // straal

    Cirkel(double r) {
        this.r = r;
    }
    
    double omtrek() {
        return 2 * r * Math.PI;
    }

    double oppervlakte() {
        return r * r * Math.PI;
    }

}
