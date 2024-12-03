public class Main{
    public static void main(String[] args) {
        // Test case 1: Default constructor
        Book unknownBook = new Book();
        unknownBook.displayDetails();

        // Test case 2: Parameterized constructor
        Book hp1Book = new Book("Harry Potter and the Philosopher's Stone", "J.K. Rowling", 350.00);
        hp1Book.displayDetails();

        // Test case 3: Updating the price
        hp1Book.updatePrice(-320.00);
        hp1Book.displayDetails();
        System.out.println("applyDiscount 25% discount:");
        hp1Book.applyDiscount(25.0); // Valid discount
        System.out.println();
    }
}

