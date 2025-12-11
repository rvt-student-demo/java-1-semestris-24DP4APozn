package rvt;
import java.util.Scanner;

public class Detaļas {
    public static void main(String[] args) {
        final int boltPrice = 5;   
        final int nutPrice = 3;    
        final int washerPrice = 1; 

        Scanner sc = new Scanner(System.in);

        int bolts = sc.nextInt();
        int nuts = sc.nextInt();
        int washers = sc.nextInt();

        boolean error = false;

        if (nuts < bolts * 2) {
            System.out.println("Parbaudi pasutijumu: par maz uzgrieznu");
            error = true;
        }

        if (washers < bolts) {
            System.out.println("Parbaudi pasutijumu: par maz paplaksnu");
            error = true;
        }

        if (!error) {
            System.out.println("Pasutijums ir kartiba.");
        }

        int total = bolts * boltPrice + nuts * nutPrice + washers * washerPrice;
        System.out.println("Kopeja cena: " + total);
    }
}
