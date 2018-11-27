import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * Week 7 - Extra Oefeningen
 * Oefening 4
 */
public class EvenRij {

    public static void main(String[] args) {

        int[] a = {1, 4, 6, 8, 10};
        List<Integer> nums = new ArrayList<Integer>();
        for (int n : a) nums.add(n);

        boolean res = a.length - (nums.stream().filter(n -> n % 2 == 0).collect(Collectors.toList()).size()) == 0;

        System.out.println(res);
    }
}
