package rvt;
import java.util.Scanner;

public class SkaitluAnalize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        int sum = 0;
        int max = 0;
        int min = 0;

        while (true) {
            System.out.print("Ievadi pozitīvu skaitli (0 vai negatīvs skaitlis pārtrauc ievadi): ");
            int n = sc.nextInt();

            if (n <= 0) {
                break;
            }

            if (count == 0) {
                max = n;
                min = n;
            }

            count++;
            sum += n;

            if (n > max) {
                max = n;
            }

            if (n < min) {
                min = n;
            }
        }

        if (count > 0) {
            double avg = (double) sum / count;

            System.out.println();
            System.out.println("Ievadīto skaitļu skaits: " + count);
            System.out.println("Skaitļu summa: " + sum);
            System.out.println("Vidējā vērtība: " + avg);
            System.out.println("Lielākais skaitlis: " + max);
            System.out.println("Mazākais skaitlis: " + min);
        }
    }
}