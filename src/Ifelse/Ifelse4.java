package Ifelse;

import java.util.Scanner;

public class Ifelse4 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite ime: ");
        String ime = s.next();
        System.out.println("Unesite prezime: ");
        String prezime = s.next();
        System.out.println("Unesite godiste: ");
        int godiste = s.nextInt();
        int godina = 2023;

        if (godina - godiste > +18) {
            System.out.println(ime + " " + prezime + " je punoletan. ");
        } else {
            System.out.println(ime + " " + prezime + " nije punoletan. ");
        }


    }}

