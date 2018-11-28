import java.util.Random;

/**
 * Week 7 - Extra Oefeningen
 * Oefening 9
 */
public class PaswoordGenerator {

    public static void main(String[] args) {
        
        char[] chars = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
                        'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
                        'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G',
                        'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
                        'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2',
                        '3', '4', '5', '6', '7', '8', '9', '*', '#', '$', '%',
                        '?', '!', '@', '^'};

        char[] password = new char[12];
        Random rand = new Random();
        for (int i = 0; i < password.length; i++) {
            password[i] = chars[rand.nextInt(chars.length)];
        }
        System.out.println(String.valueOf(password));
    }
}
