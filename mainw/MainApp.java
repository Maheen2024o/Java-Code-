package mainw;

public class MainApp {
	
	public static void main(String[] args) {
        String jsonFilePath = "/src/main/resources/booksData.json"; 
        BookProcessor bookProcessor = new BookProcessor(jsonFilePath);

        // Display all books
        System.out.println("Displaying all books:");
        bookProcessor.displayAllBooks();

        // Find and display books by a specific author
        System.out.println("\nBooks by Jane Doe:");
        bookProcessor.findBooksByAuthor("Jane Doe");

        // Calculate and display the average price of all books
        System.out.println("\nAverage price of all books:");
        bookProcessor.calculateAveragePrice();

        // Display the title of the book with the highest price
        System.out.println("\nBook with the highest price:");
        bookProcessor.displayBookWithHighestPrice();

        // Find and list books of a specific category
        System.out.println("\nBooks in the 'fantasy' category:");
        bookProcessor.findBooksByCategory("fantasy");
	    }
	
}
