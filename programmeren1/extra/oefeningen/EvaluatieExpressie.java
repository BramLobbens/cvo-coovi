/*
Oefening 13
*/
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class EvaluatieExpressie {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("EvaluatieExpressie kan twee integers vergelijken d.m.v. '>', '<', '==' en afgeleide vergelijkingen.");
        System.out.print("Geef een expressie: ");
        String expressie = input.nextLine();

        // Tokenize
        List<String> operands = new ArrayList<String>();
        String operand = "";
        String operator = "";
        for (char c : expressie.toCharArray()) {
            if (c >= '0' && c <= '9')
                operand += String.valueOf(c);
            else if ("><!=".indexOf(c) >= 0)
                operator += String.valueOf(c);
            else if (" \t\b\n".indexOf(c) >= 0 && operator.length() > 0) {
                operands.add(operand);
                operand = "";
            }
        }
        operands.add(operand);

        // Parse
        boolean result;
        switch (operator) {
        case ">":
            result = Integer.parseInt(operands.get(0)) > Integer.parseInt(operands.get(1));
            break;
        case "<":
            result = Integer.parseInt(operands.get(0)) < Integer.parseInt(operands.get(1));
            break;
        case "<=":
            result = Integer.parseInt(operands.get(0)) <= Integer.parseInt(operands.get(1));
            break;
        case ">=":
            result = Integer.parseInt(operands.get(0)) >= Integer.parseInt(operands.get(1));
            break;
        case "==":
            result = Integer.parseInt(operands.get(0)) == Integer.parseInt(operands.get(1));
            break;
        case "!=":
            result = Integer.parseInt(operands.get(0)) != Integer.parseInt(operands.get(1));
            break;
        default:
            result = false;
            System.out.println("Operator not defined");
            return;
        }
        
        // Debugging
        //System.out.println("operands: " + operands);
        //System.out.println("operator: " + operator);

        System.out.printf("De expressie %s is %s.\n", expressie, result ? "waar" : "vals");
    }
}
