/*
Programmeren 1 - Opdracht 3
Oefening 1 - BitsEnBytes.java
*/
import java.io.*;
import java.util.Scanner;
import java.util.Locale;

public class BitsEnBytes {
   
   private static final int SIZE = 1024;
   private float megabytes;
   private float kilobytes;
   private float bytes;
   private float nibbles;
   private float bits;
   
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      scanner.useLocale(Locale.US); // use decimal point (dot)
      
      System.out.println("Geef uw waarde: ");
      float megabytes = scanner.nextFloat();
      
      System.out.println(megabytes + " megabyte is:");
      
      float kilobytes = megabytes * SIZE;
      System.out.println(kilobytes + " kilobytes");
      
      float bytes = kilobytes * SIZE;
      System.out.println(bytes + " bytes");
      
      float nibbles = bytes * 2;
      System.out.println(nibbles + " nibbles");
      
      float bits = nibbles * 4;
      System.out.println(bits + " bits");
      
  }
}
