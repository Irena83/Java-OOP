import java.util.Scanner;

public class DataTypes6 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite neki broj:");
        int a = s.nextInt();


        System.out.println("Uneta vrednost je: " + a);
        System.out.println("Trazena vrednost je: " + (a+10));
    }
}
