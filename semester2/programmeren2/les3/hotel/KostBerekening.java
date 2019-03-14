package hotel;

public class KostBerekening {

    public static void main (String[] args) {

        Hotel marriott = new Hotel("Marriott", 200, 3);
        Hotel ibis = new Hotel("Ibis", 30, 6);

        System.out.println("Voor " + marriott.getOvernachtingen() +
                           " nachten betaald u bij " + marriott.getNaam() +
                           " EUR " + marriott.prijsOvernachtingen() +
                           ".");
        System.out.println("Voor " + ibis.getOvernachtingen() +
                           " nachten betaald u bij " + ibis.getNaam() +
                           " EUR " + ibis.prijsOvernachtingen() +
                           ".");

        System.out.println(marriott);
    }
}
