package rvt;

import java.util.Scanner;

public class SumOfUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Statistics statistics = new Statistics();

        System.out.println("Enter numbers:");

        while (true) {
            int n = sc.nextInt();
            if (n == -1) break;

            statistics.addNumber(n);
        }

        System.out.println("Sum: " + statistics.sum());
    }
}