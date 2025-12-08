package rvt;
import java.util.Scanner;

public class Delikatese {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ievadi preci: ");
        String product = sc.nextLine();

        System.out.print("Ievadi cenu: ");
        double price = Double.parseDouble(sc.nextLine());

        System.out.print("Ekspress piegāde (0 = nē, 1 = jā): ");
        int express = Integer.parseInt(sc.nextLine());

        double delivery;

        if (price < 10) {
            delivery = 2.00;
        } else {
            delivery = 0.00;
        }

        if (express == 1) {
            delivery += 3.00;
        }

        double total = price + delivery;

        System.out.println("Rēķins:");
        System.out.println(product + ": " + price);
        System.out.println("piegāde: " + delivery);
        System.out.println("kopā: " + total);
    }
}
