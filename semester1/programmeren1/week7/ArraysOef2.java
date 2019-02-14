/**
* Programmeren 1 - Les 7
*/
public class ArraysOef2 {

    public static void main(String[] args) {
   
        int[] arrayA = new int[] {1, 2, 3, 4, 5, 6};
        int[] arrayB = new int[] {10, 20, 30, 40, 50, 60};
        
        System.out.println("\tVoor toekenning");
        for (int i = 0; i < arrayB.length; i++) {
            System.out.println("\tarrayA[" + i + "] = " + arrayA[i] + "\tarrayB[" + i + "] = " + arrayB[i]);
        }
        
        arrayB = arrayA;
        arrayA[3] = 1000;
        System.out.println("\n\tNa toekenning");
        for (int i = 0; i < arrayB.length; i++) {
            System.out.println("\tarrayA[" + i + "] = " + arrayA[i] + "\tarrayB[" + i + "] = " + arrayB[i]);
        }
    }
}