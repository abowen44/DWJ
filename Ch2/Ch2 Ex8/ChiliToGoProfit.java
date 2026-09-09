// Alexis Bowen
// p 81 Exa Sept 2

import java.util.Scanner;

public class ChiliToGoProfit {

    public static void main(String[] args) {
        int noAdultMeals;
        int noChildMeals;

        double priceAdult = 7.0;
        double priceChild = 4.0;

        double costAdult = 4.35;
        double costChild = 3.10;

        double totalChild = 0.0;
        double totalAdult = 0.0;
        double totalAll = 0.0;

        double profitChild = 0.0;
        double profitAdult = 0.0;
        double profitAll = 0.0;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the number of children's meals >> ");
        noChildMeals = input.nextInt();

        System.out.print("Please enter the number of adult meals >> ");
        noAdultMeals = input.nextInt();

        totalChild = noChildMeals * priceChild;
        totalAdult = priceAdult * noAdultMeals;
        totalAll = totalChild + totalAdult;

        profitChild = noChildMeals * (priceChild - costChild);
        profitAdult = noAdultMeals * (priceAdult - costAdult);
        profitAll = profitChild + profitAdult;

        System.out.printf("The total amount of money collected for children's meals is $%.2f%n", totalChild);
        System.out.printf("The total amount of money collected for adult meals is $%.2f%n", totalAdult);
        System.out.printf("The total amount of money collected for all meals is $%.2f%n", totalAll);

        System.out.printf("The total profit for children's meals is $%.2f%n", profitChild);
        System.out.printf("The total profit for adult meals is $%.2f%n", profitAdult);
        System.out.printf("The grand total profit is $%.2f%n", profitAll);
    }
}
