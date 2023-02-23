package ArrayWhile;
import java.util.Scanner;

//User enters numbers using the keyboard. Program adds numbers until the user enters a zero or negative number.

public class While {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        int number;

        while (true) {
            System.out.println("Enter number (enter 0 or a negative number to exit):");
            number = input.nextInt();
            if (number <= 0) {
                break;
            }
            sum = sum + number;
        }

        System.out.println("The sum of the numbers entered is " + sum);
    }
}
