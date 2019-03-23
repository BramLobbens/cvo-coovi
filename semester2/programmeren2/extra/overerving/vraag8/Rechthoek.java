/*
 * Programmeren 2 - Extra Taken
 * Vraag 8
 */
package vraag8;

class Rechthoek extends Vorm {

    double lengte, breedte;

    Rechthoek(double lengte, double breedte) {
        this.lengte = lengte;
        this.breedte = breedte;
    }

    double omtrek() {
        return 2 * (lengte + breedte);
    }

    double oppervlakte() {
        return lengte * breedte;
    }
}
