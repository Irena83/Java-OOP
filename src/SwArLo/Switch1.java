package SwArLo;

import java.util.Scanner;

public class Switch1 {
    public static void main(String[] args) {

        int day = 1;

        switch (day) {
            case 1: System.out.println("Ponedeljak");
                break;
            case 2: System.out.println("Utorak");
                break;
            case 3: System.out.println("Sreda");
                break;
            case 4: System.out.println("Cetvrtak");
                break;
            case 5: System.out.println("Petak");
                break;
            case 6: System.out.println("Subota");
                break;
            case 7: System.out.println("Nedelja");
                break;
            default:
                System.out.println("Produzena nedelja");
        }
    }

}