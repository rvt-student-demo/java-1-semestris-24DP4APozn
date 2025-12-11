package rvt;

import java.util.ArrayList;
import java.util.Scanner;

public class Books {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.print("Title: ");
            String title = sc.nextLine();

            if (title.equals("")) {
                break;
            }

            System.out.print("Pages: ");
            int pages = Integer.parseInt(sc.nextLine());

            System.out.print("Publication year: ");
            int year = Integer.parseInt(sc.nextLine());

            books.add(new Book(title, pages, year));
        }

        System.out.print("What information will be printed? ");
        String choice = sc.nextLine();

        if (choice.equals("everything")) {
            for (Book b : books) {
                System.out.println(b);
            }
        } else if (choice.equals("name")) {
            for (Book b : books) {
                System.out.println(b.getTitle());
            }
        }
    }
}