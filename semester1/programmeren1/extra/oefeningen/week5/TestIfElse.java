/*
Week 5 - extra oefeningen
Oefening 1
*/
import java.io.*;

public class TestIfElse {

    public static void main(String[] args) throws IOException, IllegalArgumentException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Geef een reëel getal in: ");
        double val = Double.parseDouble(in.readLine());
        char score;
        
        if (val < 50.5)
            score = 'A';
        else if (val >= 50.5 && val < 51.0)
            score = 'B';
        else if (val >= 51.0 && val < 51.5)
            score = 'C';
        else if (val >= 51.5 && val < 52.0)
            score = 'D';
        else if (val >= 52)
            score = 'E';
        else
            throw new IllegalArgumentException("Incorrect argument");

        System.out.println(score);
    }
}
