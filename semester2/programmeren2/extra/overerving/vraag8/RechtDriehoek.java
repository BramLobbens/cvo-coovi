/*
 * Programmeren 2 - Extra Taken
 * Vraag 8
 */
package vraag8;

class RechtDriehoek extends Vorm {
    
    double zijde;

    RechtDriehoek(double zijde) {
        this.zijde = zijde;
    }

    double omtrek() {
        return zijde + zijde + zijde;
    }

    double oppervlakte() {
        // area = (s^2*(sqrt(3))/(4)
        return zijde * zijde * Math.sqrt(3) / 4;
    }

}
