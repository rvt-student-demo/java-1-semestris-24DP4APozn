package rvt;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Your code goes here...
        // Modify the program so that it will print the following text.
        System.out.println("Once upon a time");
        System.out.println("there was");
        System.out.println("a program");
        //Write a program that asks the user to write a string.
        Scanner scanner = new Scanner (System.in);
        System.out.println("Write here your name: ");
        String name = scanner.nextLine();
        System.out.println("Hi, " + name);
        //Program prints the number of seconds in the given number of days.
        System.out.println("Write here number of days: ");
        int days = Integer.valueOf(scanner.nextLine());
        int how_much = (days * 86400);
        System.out.println("In " + days + " days is " + how_much + " seconds!");
    }
}
