package rvt;

import java.util.Scanner;
import java.util.ArrayList;

public class OnlyTheseNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            int n = sc.nextInt();
            if (n == -1) {
                break;
            }
            numbers.add(n);
        }

        System.out.print("From where? ");
        int start = sc.nextInt();

        System.out.print("To where? ");
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {
            System.out.println(numbers.get(i));
        }
    }
}