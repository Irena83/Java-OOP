package Ifelse;

import java.util.Scanner;

public class Ifelse5 {


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite x: ");
        int x = s.nextInt();
        System.out.println("Unesite y: ");
        int y = s.nextInt();
        System.out.println("Unesite z: ");
        int z = s.nextInt();

        if (y > x && z > y) {
            System.out.print("Vrednosti su u rastucem nizu");

        }
    }

}