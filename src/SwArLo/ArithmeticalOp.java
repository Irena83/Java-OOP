package SwArLo;

import java.util.Scanner;

public class ArithmeticalOp {
    public static void main(String[] args) {

        double a;
        double b;
        String operation;

        Scanner input = new Scanner(System.in);

        System.out.println(" please enter the first number");
        a = input.nextInt();

        System.out.println(" please enter the second number");
        b = input.nextInt();

        Scanner op = new Scanner(System.in);
        System.out.println("please enter operation");
        operation = op.next();

        if (operation.equals("+")) {
            System.out.println("your answer is " + (a + b));
        }
        if (operation.equals("-")) {
            System.out.println("your answer is " + (a - b));
        }
        if (operation.equals("/")) {
            System.out.println("your answer is " + (a / b));
        }
        if (operation.equals("*")) {
            System.out.println("your answer is " + (a * b));
        }
        if (operation.equals("%")) {
            System.out.println("your answer is " + (a % b));
        }

    }

}
