// Alexis Bowen

import java.util.Scanner;

public class IntegerDemoInteractiveWithName {
    public static void main(String[] var0) { 
        Scanner var7 = new Scanner(System.in);
        System.out.print("Please enter an interger >> ");
        int var1 = var7.nextInt();
        System.out.print("Please enter a byte integer >> ");
        byte var2 = var7.nextByte();
        System.out.print("Please enter a short integer >> ");
        short var3 = var7.nextShort();
        System.out.print("Please enter a long integer >> ");
        long var4 = var7.nextLong();
        System.out.print("Please enter your name >> ");
        var7.nextLine();
        String var6 = var7.nextLine();
        System.out.println("Thank you, " + var6);
        System.out.println("The int is " + var1);
        System.out.println("The byte is " + var2);
        System.out.println("The short is " + var3);
        System.out.println("The long is " + var4);
    }
}
