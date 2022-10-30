public class Calculator {
    private double num1;
    private double num2;
    private String sign;

    public Calculator(double num1, double num2, String sign) {
        this.num1 = num1;
        this.num2 = num2;
        this.sign = sign;
    }

    public double solution() {
        if(sign == "*") {
            return num1 * num2;
        } else if(sign == "/") {
            return num1 / num2;
        } else if(sign == "+") {
            return num1 + num2;
        } else if (sign == "-") {
            return num1 - num2;
        } else if (sign == "%") {
            return num1 % num2;
        } else{
            return Math.pow(num1, num2);
        }
    }


}
