package Ifelse;
import java.util.Scanner;
public class Ifelse1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        if (a > 0) {
            System.out.println("Broj je veci od nule");
        } else {
            System.out.println("Broj je manji od nule");
        }

    }

}
