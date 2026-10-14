// Alexis Bowen
// p 387 C

import java.util.Scanner;

public class UseBook {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the title of a fiction book: ");
        String fictionTitle = input.nextLine();
        Fiction fictionBook = new Fiction(fictionTitle);

        System.out.print("Enter the title of a nonfiction book: ");
        String nonFictionTitle = input.nextLine();
        NonFiction nonFictionBook = new NonFiction(nonFictionTitle);

        System.out.println("\nBook details:");
        System.out.println("Fiction title: " + fictionBook.getTitle());
        System.out.printf("Fiction price: $%.2f%n", fictionBook.getPrice());

        System.out.println("Nonfiction title: " + nonFictionBook.getTitle());
        System.out.printf("Nonfiction price: $%.2f%n", nonFictionBook.getPrice());

        input.close();
    }
}
