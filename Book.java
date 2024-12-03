public class Book {
    // Fields
    private String title;
    private String author;
    private double price;

    // Default constructor
    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    // Parameterized constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        if(price >= 0){
            this.price = price;
        }else{
            this.price = -price;
        }
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }

    // Method to update book price
    public void updatePrice(double newPrice) {
        if (newPrice >= 0) {
            this.price = newPrice;
        }else {
            this.price = -newPrice;
            }
    }
    public void applyDiscount(double discount) {
        if (discount > 0.0 && discount < 100.0) {
            double discountvalue = price * (discount/ 100);
            price -= discountvalue;
            System.out.printf("Discount of %.2f%% applied. \nNew price: %.2f%n", discount, price);
        } else {
            System.out.println("Invalid discount percentage. Must be greater than 0 and less than 100.");
        }

    }
}


