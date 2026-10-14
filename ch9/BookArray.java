// Alexis Bowen 
// p 387 D

import java.util.Scanner;

public class BookArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Book[] books = new Book[10];

        for (int i = 0; i < books.length; i++) {
            System.out.print("Enter the title of book " + (i + 1) + ": ");
            String title = input.nextLine();

            String type;
            while (true) {
                System.out.print("Is it fiction or nonfiction? Enter F or N: ");
                type = input.nextLine().trim();

                if (type.equalsIgnoreCase("F") || type.equalsIgnoreCase("N")) {
                    break;
                }

                System.out.println("Please enter F for fiction or N for nonfiction.");
            }

            if (type.equalsIgnoreCase("F")) {
                books[i] = new Fiction(title);
            } else {
                books[i] = new NonFiction(title);
            }
        }

        System.out.println("\nBook details:");
        for (int i = 0; i < books.length; i++) {
            String type = books[i] instanceof Fiction ? "Fiction" : "Nonfiction";

            System.out.println("\nBook " + (i + 1));
            System.out.println("Type: " + type);
            System.out.println("Title: " + books[i].getTitle());
            System.out.printf("Price: $%.2f%n", books[i].getPrice());
        }

        input.close();
    }
}
