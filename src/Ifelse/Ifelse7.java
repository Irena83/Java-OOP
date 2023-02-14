package Ifelse;

import java.util.Scanner;

public class Ifelse7 {


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite vrednost broja x: ");
        int x = s.nextInt();

        if (x % 2 == 0 && x % 3 == 0) {
            System.out.println("Broj je deljiv sa 2 i 3. ");
        } else if (x % 3 == 0) {
            System.out.println("Broj je deljiv sa 3. ");
        } else if (x % 2 == 0) {
            System.out.println("Broj je deljiv sa 2. ");
        } else {
            System.out.println("Broj nije deljiv ni sa 2 ni sa 3. ");
        }
    }
}
