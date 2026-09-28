// Alexis Bowen
// Page 298

import java.util.Scanner;

public class BubbleSortDemo {

    public static void main(String[] args) {
        int[] someNums = new int[5];
        int comparisonsToMake = someNums.length - 1;
        int temp;

        Scanner keyboard = new Scanner(System.in);

        // Enter values into the array
        for (int a = 0; a < someNums.length; ++a) {
            System.out.print("Enter number " + (a + 1) + " >> ");
            someNums[a] = keyboard.nextInt();
        }

        // Display the original array
        display(someNums, 0);

        // Perform the bubble sort
        for (int a = 0; a < someNums.length - 1; ++a) {
            for (int b = 0; b < comparisonsToMake; ++b) {
                if (someNums[b] > someNums[b + 1]) {
                    temp = someNums[b];
                    someNums[b] = someNums[b + 1];
                    someNums[b + 1] = temp;
                }
            }

            display(someNums, a + 1);
            --comparisonsToMake;
        }

        keyboard.close();
    }

    public static void display(int[] someNums, int iteration) {
        System.out.print("Iteration " + iteration + ": ");

        for (int x = 0; x < someNums.length; ++x) {
            System.out.print(someNums[x] + " ");
        }

        System.out.println();
    }
}
