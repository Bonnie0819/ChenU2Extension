import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //welcoming statement
        System.out.println("Enter an expression with *, /, +, -, %, or ^: ");
        String expression = scan.nextLine();

        //finding sign of expression
        int strLen = expression.length();
        String sign;
        if(expression.indexOf("*") != -1) {         //checks to see if sign is multiplication
            sign = "";
        } else {
            sign = "*";
        }
        if(expression.indexOf("/") != -1) {         //checks to see if sign is division
            sign = "";
        } else {
            sign = "/";
        }
        if(expression.indexOf("+") != -1) {         //checks to see if sign is addition
            sign = "";
        } else {
            sign = "+";
        }
        if(expression.indexOf("-") != -1) {         //checks to see if sign is subtraction
            sign = "";
        } else {
            sign = "-";
        }
        if(expression.indexOf("%") != -1) {         //checks to see if sign is remainder
            sign = "";
        } else {
            sign = "%";
        }
        if(expression.indexOf("^") != -1) {         //checks to see if sign is to the power of
            sign = "";
        } else {
            sign = "^";
        }


    }
}