/**
* Programmeren 1 - Les 7
*/
public class ArraysOef1 {

    public static void main(String[] args) {
   
        int[] a = new int[50];
        for (int i = 0; i < 50; i++) {
            a[i] = i;
        }
         
        a = new int[100];
        for (int i = 0; i < 100; i++) {
            a[i] = i;
        }
         
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        
        System.out.println("Aantal elementen: " + a.length);
    }
}