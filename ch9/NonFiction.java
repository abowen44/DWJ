// Alexis Bowen
// p 387 B

public class NonFiction extends Book {
    public NonFiction(String title) {
        super(title);
        setPrice();
    }

    @Override
    public void setPrice() {
        price = 37.99;
    }

    public static void main(String[] args) {
        NonFiction book = new NonFiction("Example Nonfiction Book");
        System.out.println("Title: " + book.getTitle());
        System.out.println("Price: $" + book.getPrice());
    }
}
