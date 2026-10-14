// Alexis Bowen
// p 387 B

public class Fiction extends Book {
    public Fiction(String title) {
        super(title);
        setPrice();
    }

    @Override
    public void setPrice() {
        price = 24.99;
    }

    public static void main(String[] args) {
        Fiction book = new Fiction("Example Fiction Book");
        System.out.println("Title: " + book.getTitle());
        System.out.println("Price: $" + book.getPrice());
    }
}

