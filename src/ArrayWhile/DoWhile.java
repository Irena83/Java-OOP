package ArrayWhile;
import java.util.Scanner;

//User enters numbers using the keyboard. After entering, the program asks the user to enter 0 to finish the program or to enter 1 to continue.
//If user enters 0 program adds all previously entered numbers.

public class DoWhile {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int sum = 0;
            int num = 1;
            int option;

            do {
                System.out.print("Enter a number: ");
                num = input.nextInt();
                sum = sum + num;
                System.out.print("Enter 0 to finish or 1 to continue: ");
                option = input.nextInt();
            } while (option != 0);

            System.out.println("The sum of the entered numbers is: " + sum);
        }
    }



