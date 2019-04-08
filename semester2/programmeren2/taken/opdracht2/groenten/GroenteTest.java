package groenten;

public class GroenteTest {
    
    public static void main(String[] args) {
        
        Komkommer courgette = new Komkommer("courgette", "donkergroen", "bitter");
        Tomaat marzano = new Tomaat("marzano", "helder rood", "zoet");
        
        System.out.print("De komkommer " + courgette.getSoort() + " is ");
        courgette.heeftKleur();
        System.out.print(" en  is ");
        courgette.heeftSmaak();
        System.out.println("");
        
        System.out.print("De tomaat " + marzano.getSoort() + " is ");
        marzano.heeftKleur();
        System.out.print(" en  is ");
        marzano.heeftSmaak();
        System.out.println("");
    }

}
