package rvt;
import java.util.Scanner;

public class MultipleSums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Statistics allStats = new Statistics();
        Statistics evenStats = new Statistics();
        Statistics oddStats = new Statistics();

        System.out.println("Enter numbers:");

        while (true) {
            int num = sc.nextInt();
            if (num == -1) break;

            allStats.addNumber(num);

            if (num % 2 == 0) {
                evenStats.addNumber(num);
            } else {
                oddStats.addNumber(num);
            }
        }

        System.out.println("Sum: " + allStats.sum());
        System.out.println("Sum of even numbers: " + evenStats.sum());
        System.out.println("Sum of odd numbers: " + oddStats.sum());
    }
}
