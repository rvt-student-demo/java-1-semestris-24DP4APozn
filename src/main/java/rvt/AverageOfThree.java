package rvt;

import java.util.Scanner;

public class AverageOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number: ");
        int first_number = scanner.nextInt();

        System.out.println("Give the second number: ");
        int second_number = scanner.nextInt();

        System.out.println("Give the second number: ");
        int Third_number = scanner.nextInt();

        System.out.println("Average of three numbers: ");
        System.out.println(first_number + second_number + Third_number / 3);
    }
}
