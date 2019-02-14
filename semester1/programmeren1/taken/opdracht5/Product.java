import java.util.Scanner;

/**
 * Programmeren 1 - Opdracht 5
 * Oefening 1 - Product.java
 */
public class Product {

    /**
     * Lees aantal waarden in van de gebruiker in een array van grootte "size",
     * met boven- en ondergrenzen [lower, upper].
     */
     public static int[] getBoundedInput(int size, final int lower, final int upper) {

        int[] nums = new int[size];
        Scanner reader = new Scanner(System.in);
        
        for (int i = 0; i < nums.length; i++) {
            int num = 0;
            while (num < lower || num > upper) {
                System.out.printf("Voer getal %d in: ", i + 1);
                num = Integer.parseInt(reader.nextLine());
            }
            nums[i] = num;
        }
        
        return nums;
    }
    
    /**
     * Maak het product van alle gehele getallen in array.
     */
    public static int product(int[] xs) {
        int prod = 1;
        for (int x : xs)
            prod *= x;
        return prod;
    }

    public static void main(String[] args) {

        System.out.println("Voer drie getallen tussen [10, 100] in.");
        System.out.println("Product = " + product(getBoundedInput(3, 10, 100)));
    }
}
