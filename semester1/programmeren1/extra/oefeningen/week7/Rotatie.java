import java.util.Random;

/**
 * Week 7 - Extra Oefeningen
 * Oefening 8
 */
public class Rotatie {

    private static int[] rotate(int[] xs) {
        int[] ys = new int[xs.length];
        for (int i = 1; i < ys.length; i++) {
            ys[i - 1] = xs[i];
        }
        ys[ys.length - 1] = xs[0]; // move head xs to tail ys
        return ys;
    }

    // better with modulo (change 1 to different value to rotate further
    private static int[] rotate_(int[] xs) {
        int[] ys = new int[xs.length];
        for (int i = 0; i < ys.length; i++) {
            ys[(i + 1) % xs.length] = xs[i];
        }
        return ys;
    }

    public static void main(String[] args) {

        int[] nums = new int[9];
        Random rand = new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = rand.nextInt(101);
            System.out.print(nums[i] + ", ");
        }
        System.out.println();
        
        int[] rotatedNums = rotate(nums);
        for (int rotatedNum : rotatedNums) {
            System.out.print(rotatedNum + ", ");
        }
        System.out.println();
    }
}
