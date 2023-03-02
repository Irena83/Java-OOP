package Function;
import java.util.Scanner;

public class Function {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double number1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double number2 = input.nextDouble();

        System.out.print("Choose the operation (+, -, *, /, %, ^, //): ");
        String operator = input.next();

        double result = 0.0;
        boolean validOperator = true;

        switch(operator) {
            case "+":
                result = add(number1, number2);
                break;
            case "-":
                result = subtract(number1, number2);
                break;
            case "*":
                result = multiply(number1, number2);
                break;
            case "/":
                result = divide(number1, number2);
                break;
            case "%":
                result = modulus(number1, number2);
                break;
            case "^":
                result = exponentiation(number1, number2);
                break;
            case "//":
                result = floorDivide(number1, number2);
                break;
            default:
                System.out.println("Invalid operation");
                validOperator = false;
                break;
        }
        if(validOperator) {
            System.out.println("The result is: " + result);
        }
    }
    public static double add(double number1, double number2) {
        return number1 + number2;
    }
    public static double subtract(double number1, double number2) {
        return number1 - number2;
    }
    public static double multiply(double number1, double number2) {
        return number1 * number2;
    }
    public static double divide(double number1, double number2) {
        return number1 / number2;
    }
    public static double modulus(double number1, double number2) {
        return number1 % number2;
    }
    public static double exponentiation(double number1, double number2) {
        return Math.pow(number1, number2);
    }
    public static double floorDivide(double number1, double number2) {
        return Math.floorDiv((int) number1, (int) number2);
    }
}
