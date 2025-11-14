package rvt;

import java.util.Scanner;

public class GradesandPoints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give points [0-100]:");
        int number = scanner.nextInt();

        if (number >= 0 && number <= 50){
            System.out.println("Grade: failed");

        } else if (number >= 50 && number <= 59){
            System.out.println("Grade: 1");

        } else if(number >= 60 && number <= 69){
            System.out.println("Grade: 2");
        
        } else if (number >= 70 && number <= 79){
            System.out.println("Grade: 3");

        } else if (number >= 80 && number <= 89){
            System.out.println("Grade: 4");

        } else if (number >= 90 && number <= 100){
            System.out.println("Grade: 5");

        } else if (number > 100){
            System.out.println("Incredible!");
            
        } else if (number < 0){
            System.out.println("Impossible!");
        }
    }
}
