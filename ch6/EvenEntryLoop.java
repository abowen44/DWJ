// Alexis Bowen
// p 232


public class EvenEntryLoop {
    
    public static void main(String[] args)
    {
       
        int number = 5;
        while(number != 999)
            if(number % 2 == 0)
            {    System.out.print("Good job ");
    }
            else 
            {    
                System.out.print("not an even number");
                number = 999;
            }
        System.out.println("Thank you for running the program!");
    }
}
