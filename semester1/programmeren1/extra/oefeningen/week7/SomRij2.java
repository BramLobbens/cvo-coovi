import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

/**
 * Week 7 - Extra Oefeningen
 * Oefening 2 - versie 2
 */
public class SomRij2 {

    public static void main(String[] args) {

        double[] rij = {-9.5, 3.0, 25.7, -3.14, 189.0, 2.728, -98.5, 23.1};
        List<Double> nums = new ArrayList<Double>();
        for (double n : rij) nums.add(n);

        /*
        // this
        double sum = nums.stream().mapToDouble(Double::doubleValue).sum();
        // can be simplified to
        double sum = nums.stream().reduce(0.0, Double::sum);
        */

        /* second solution
        double sumPos = nums.stream()
            .filter(n -> n > 0)
            .mapToDouble(n -> n)
            .sum();
        */
        // or as learnt from above
        double sumPos = nums.stream()
            .filter(n -> n > 0)
            .reduce(0.0, Double::sum);
        /*
        double sumNeg = nums.stream()
            .filter(n -> n < 0)
            .mapToDouble(n -> n)
            .sum();
        */
        double sumNeg = nums.stream()
            .filter(n -> n < 0)
            .reduce(0.0, Double::sum);

        System.out.println("Som pos getallen: " + sumPos);
        System.out.println("Som neg getallen: " + sumNeg);

    }
}
