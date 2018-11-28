import java.util.Random;

/**
 * Week 7 - Extra Oefeningen
 * Oefening 6
 */
public class Lotto {

    private static boolean inArray(int n, int[] xs) {
        for (int x : xs) {
            if (n == x) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] nums = new int[42];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 1;
        }

        Random rand = new Random();
        int[] randNums = new int[6];
        for (int i = 0; i < randNums.length; i++) {
            
            int randNum = rand.nextInt(nums.length + 1);
            while (inArray(randNum, randNums)) {
                randNum = rand.nextInt(nums.length + 1);
            }
            randNums[i] = randNum;
        }     
        
        for (int randNum : randNums) {
            System.out.println(randNum);
        }
    }
}
