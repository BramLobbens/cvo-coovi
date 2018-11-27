import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Week 7 - Extra Oefeningen
 * Oefening 2 - versie 1
 */
public class SomRij {

    /**
     * maak som van een List<Double>
     */
    private static double sumOf(List<Double> xs) {
        return xs.stream().reduce(0.0, Double::sum);
    }

    public static void main(String[] args) {

        double[] rij = {-9.5, 3.0, 25.7, -3.14, 189.0, 2.728, -98.5, 23.1};
        List<Double> nums = new ArrayList<Double>();
        for (double n : rij) nums.add(n);

        // maak lijst van strikt positieve getallen
        List<Double> posNums = nums.stream()
                                .filter(n -> n > 0)
                                .collect(Collectors.toList());
        // maak lijst van strikt negatieve getallen
        List<Double> negNums = nums.stream()
                                .filter(n -> n < 0)
                                .collect(Collectors.toList());

        System.out.println("Som pos getallen: " + sumOf(posNums));
        System.out.println("Som neg getallen: " + sumOf(negNums));

    }
}
