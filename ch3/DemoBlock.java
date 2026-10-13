// Alexis Bowen

public class DemoBlock {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        System.out.println("Before the block:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        {
            int z = 30;
            x = 40;
            int yInside = 50;

            System.out.println("Inside the block:");
            System.out.println("x = " + x);
            System.out.println("y = " + y);
            System.out.println("yInside = " + yInside);
            System.out.println("z = " + z);
        }

        System.out.println("After the block:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
