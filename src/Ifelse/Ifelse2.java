package Ifelse;
import java.util.Scanner;
public class Ifelse2 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite a: ");
        int a = s.nextInt();
        System.out.print("Unesite b: ");
        int b = s.nextInt();

            if (a > 0 && b > 0) {
                System.out.println("Brojevi su veci od nule");
            } else if ( a < 0 && b < 0 ) {
                System.out.println("Brojevi su manji od nule");
            } else if ( a == 0 || b == 0 ) {
                System.out.println("Jedan od unetih brojeva je nula");
            } else if ( a > 0 || b < 0 ) {
                System.out.println("Broj a je veci od nule, dok je broj b manji od nule");
            } else if  ( a < 0 || b > 0) {
                System.out.println("Broj a je manji od nule, dok je broj b veci od nule");


        }
    }
}

