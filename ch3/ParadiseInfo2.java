// Alexis Bowen

import java.util.Scanner;

public class ParadiseInfo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the minimum purchase price: $");
        double price = input.nextDouble();

        System.out.print("Enter the discount percentage: ");
        double discount = input.nextDouble();

        double savings = calculateSavings(price, discount);

        System.out.printf("Your savings are $%.2f%n", savings);

        input.close();
    }

    public static double calculateSavings(double price,
                                          double discount) {
        return price * discount / 100;
    }
}
