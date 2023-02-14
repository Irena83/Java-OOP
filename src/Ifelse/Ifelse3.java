package Ifelse;

import java.util. Scanner;
public class Ifelse3 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite x: ");
        int x = s.nextInt();
        System.out.print("Unesite y: ");
        int y = s.nextInt();

        if (x%2 == 0) {
            System.out.println ("Broj " + x + " je paran ");
        } else if (x%2 == 1) {
            System.out.println("Broj " + x + " je neparan ");
        }

        if (y%2 == 0) {
            System.out.println("Broj " + y + " je paran ");
        } else if (y%2 == 1) {
            System.out.println("Broj " + y + " je neparan ");
        }

    }
}






