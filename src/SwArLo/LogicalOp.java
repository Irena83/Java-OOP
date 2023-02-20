package SwArLo;

import java.util.Scanner;

public class LogicalOp {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Ovo je aplikacija za potvrdjivanje punoletstva. Pratite sledece instrukije.");
        System.out.println("Unesite godinu rodjenja: ");
        int godina = s.nextInt();
        System.out.println("Unesite mesec rodjenja: ");
        int mesec = s.nextInt();
        System.out.println("Unesite dan rodjenja: ");
        int dan = s.nextInt();

        int danSad = 20;
        int mesecSad = 2;
        int godinaSad = 2023;

        if (godinaSad - godina > 18) {
            System.out.println("Punoletan");
        } else if (godinaSad - godina <= 18 && mesecSad - mesec < 0 && danSad - dan > 0) {
            System.out.println("Nije punoletan");
        } else if (godinaSad - godina <= 18 && mesecSad - mesec < 0 && danSad - dan <= 0) {
            System.out.println("Nije punoletan");
        } else if (godinaSad - godina <= 18 && mesecSad - mesec > 0 && danSad - dan <= 0) {
            System.out.println("Punoletan");
        } else if (godinaSad - godina <= 18 && mesecSad - mesec > 0 && danSad - dan > 0) {
            System.out.println("Punoletan");
        } else if (godinaSad - godina <= 18 && mesecSad - mesec == 0 && danSad - dan < 0) {
            System.out.println("Nije punoletan");
        } else if (godinaSad - godina <= 18 && mesecSad - mesec == 0 && danSad - dan >= 0) {
            System.out.println("Punoletan");
        } else {
            System.out.println("Nije punoletan");

        }
    }
}