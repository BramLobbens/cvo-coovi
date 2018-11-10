/*
Les 6 - While
Raden.java
*/
import java.io.*;
import java.util.Random;

public class Raden {

   public static void main(String[] args) throws IOException {
   
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      
      Random rand = new Random();
      int num = rand.nextInt(10) + 1; // tussen 1 en 10
      int count = 0;
      boolean found = false;
      
      System.out.println("Doe een gok:");
      while (!found) {
         
         int guess = Integer.parseInt(in.readLine());
         count++;
         
         if (guess == num)
            found = true;
         else if (guess > num)
             System.out.println("Gok lager");
         else
             System.out.println("Gok hoger");
      }
      
      System.out.printf("Gevonden in %d ke%s.\n", count, count == 1 ? "er" : "ren");
   }
}   
