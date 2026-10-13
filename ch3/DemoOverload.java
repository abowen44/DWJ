// Alexis Bowen


public class DemoOverload {
    public static void main(String[] args) {
        int month = 6;
        int day = 15;
        int year = 2024;

        displayDate(month);
        displayDate(month, day);
        displayDate(month, day, year);
    }

    public static void displayDate(int month) {
        System.out.printf("%02d/01/2024%n", month);
    }

    public static void displayDate(int month, int day) {
        System.out.printf("%02d/%02d/2024%n", month, day);
    }

    public static void displayDate(int month, int day, int year) {
        System.out.printf("%02d/%02d/%04d%n", month, day, year);
    }
}
