/*
Oefening 13
*/
import java.util.Scanner;

public class EvaluatieExpressie {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("EvaluatieExpressie kan twee integers vergelijken d.m.v. '>', '<', '==' en afgeleide vergelijkingen.");
        System.out.print("Geef een expressie: ");
        String expressie = input.nextLine();

        // Tokenize
        String op1 = "";
        String op2 = "";
        String operator = "";
        for (char c : expressie.toCharArray()) {
            if (c >= '0' && c <= '9') {
                if (operator.length() > 0)
                    op2 += String.valueOf(c);
                else
                    op1 += String.valueOf(c);
            }
            else if ("><!=".indexOf(c) >= 0)
                operator += String.valueOf(c);
        }
        
        // Parse
        boolean result;
        switch (operator) {
        case ">":
            result = Integer.parseInt(op1) > Integer.parseInt(op2);
            break;
        case "<":
            result = Integer.parseInt(op1) < Integer.parseInt(op2);
            break;
        case "<=":
            result = Integer.parseInt(op1) <= Integer.parseInt(op2);
            break;
        case ">=":
            result = Integer.parseInt(op1) >= Integer.parseInt(op2);
            break;
        case "==":
            result = Integer.parseInt(op1) == Integer.parseInt(op2);
            break;
        case "!=":
            result = Integer.parseInt(op1) != Integer.parseInt(op2);
            break;
        default:
            result = false;
            System.out.println("Operator not defined");
            return;
        }

        System.out.printf("De expressie %s is %s.\n", expressie, result ? "waar" : "vals");
    }
}
