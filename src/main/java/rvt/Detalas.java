package rvt;
import java.util.Scanner;

public class Detalas {
    public static void main(String[] args) {
        final int boltPrice = 5;
        final int nutPrice = 3;
        final int washerPrice = 1;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ievadi skrūvju skaitu:");
        int bolts = sc.nextInt();

        System.out.println("Ievadi uzgriežņu skaitu:");
        int nuts = sc.nextInt();

        System.out.println("Ievadi paplāksņu skaitu:");
        int washers = sc.nextInt();

        boolean error = false;

        if (nuts < bolts * 2) {
            System.out.println("Pārbaudi pasūtījumu: par maz uzgriežņu");
            error = true;
        }

        if (washers < bolts) {
            System.out.println("Pārbaudi pasūtījumu: par maz paplāksņu");
            error = true;
        }

        if (!error) {
            System.out.println("Pasūtījums ir kārtībā.");
        }

        int total = bolts * boltPrice + nuts * nutPrice + washers * washerPrice;
        System.out.println("Kopējā cena: " + total);
    }
}