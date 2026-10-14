// Alexis Bowen

public class DivideEvenly2 
{
    public static void main(String args[])
    {
       int number; 
       final int LIMIT = 100;
       int divisor;
       for(number = 1; number <= LIMIT; ++number)
       {
        System.out.print(number + " is evenly divisible by  ");
        for(divisor = 1; divisor <= number; ++divisor)
            if(number % divisor == 0)
                System.out.print(divisor + " ");
            System.out.println();
       }
    }
}