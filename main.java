public class Main {
    public static void main(String[] args) {

        System.out.println("--- 1. Testing Default Constructor ---");
        Book unknownBook = new Book();
        System.out.println(unknownBook.getDetails());
        System.out.println();



        System.out.println("--- 2. Testing Parameterized Constructor ---");
        Book hp3Book = new Book("123", "pokemon (1st Edition)",
                "J.K. Rowling", 350.00, 1997);
        Book hp2Book = new Book("978-0-7475-3269-9", "Harry Potter (Special)",
                "J.K. Rowling", 500.00, 1997);
        Book anotherBook = new Book("978-1-23-456789-0", "Some Other Book",
                "Another Author", 200.00, 2005);

        System.out.println(hp3Book.getDetails());
        System.out.println(hp2Book.getDetails());
        System.out.println();



        System.out.println("--- 3. Testing Comparison (isSameBook) ---");
        System.out.println(hp3Book.isSameBook(hp2Book));       // true - same ISBN
        System.out.println(hp3Book.isSameBook(anotherBook));   // false - different ISBN
        System.out.println();

        System.out.println("--- 4. Testing Valid Price Update ---");
        hp3Book.updatePrice(-5);
        System.out.println(hp3Book.getDetails());
        System.out.println();

        System.out.println("--- 5. Testing Invalid Price Update (Should Not Change) ---");
        hp3Book.updatePrice(-200.00);
        System.out.println(hp3Book.getDetails());
    }
}
