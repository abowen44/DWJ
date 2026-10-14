//Alexis Bowen
//387 A

public abstract class Book {
    private String title;
    protected double price;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public abstract void setPrice();

    private static class SampleBook extends Book {
        public SampleBook(String title) {
            super(title);
        }

        @Override
        public void setPrice() {
            price = 12.99;
        }
    }

    public static void main(String[] args) {
        SampleBook book = new SampleBook("Example Book");
        book.setPrice();

        System.out.println("Title: " + book.getTitle());
        System.out.println("Price: $" + book.getPrice());
    }
}

