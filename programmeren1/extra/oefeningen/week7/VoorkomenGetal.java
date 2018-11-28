import java.util.Random;

/**
 * Week 7 - Extra Oefeningen
 * Oefening 7
 */
public class VoorkomenGetal {

    private static int inArrayCount(int n, int[] xs) {
        int count = 0;
        for (int x : xs) {
            if (n == x) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        int[] nums = new int[10];
        Random rand = new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = rand.nextInt(11);
            System.out.print(nums[i] + ", ");
        }
        System.out.println();

        int n = rand.nextInt(11);
        System.out.println(n + " in array: " + inArrayCount(n, nums));
    }
}
