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
        if(expression.indexOf("*") != -1) {               //checks to see if sign is multiplication
            sign = "*";
        }else if(expression.indexOf("/") != -1) {         //checks to see if sign is division
            sign = "/";
        }else if(expression.indexOf("+") != -1) {         //checks to see if sign is addition
            sign = "+";
        }else if(expression.indexOf("-") != -1) {         //checks to see if sign is subtraction
            sign = "-";
        }else if(expression.indexOf("%") != -1) {         //checks to see if sign is remainder
            sign = "%";
        }else {                                           //checks to see if sign is to the power of
            sign = "^";
        }

        //parsing numbers from expression
        double num1 = Double.parseDouble(expression.substring(0, (expression.indexOf(sign)-1)));
        double num2 = Double.parseDouble(expression.substring(expression.indexOf(sign) +1));

        //creating object calculator
        Calculator calculate = new Calculator(num1, num2, sign);

        System.out.println(expression + " = " + calculate.solution());





    }
}