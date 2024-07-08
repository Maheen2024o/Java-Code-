package mainw;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class BookProcessor {
    private List<Book> books;  //creating a book list

    public BookProcessor(String jsonFilePath) {
        try {
            Gson gson = new Gson();
            Type bookListType = new TypeToken<List<Book>>(){}.getType();
            books = gson.fromJson(new FileReader(jsonFilePath), bookListType); //json file that need to be parsed 
        } catch (IOException e) {
            System.out.println("Error reading JSON file: " + e.getMessage()); //using exception handling 
        }
    }

    //data of all books ---------------------------------------------------
    public void displayAllBooks() {
        books.forEach(Book::displayBookInfo);
    }
    
    //FIND BOOKS BY AUTHOR -------------------------------------------------
    public void findBooksByAuthor(String author) {
        List<Book> booksByAuthor = books.stream()
                .filter(book -> book.getAuthor().equalsIgnoreCase(author))
                .collect(Collectors.toList());
        booksByAuthor.forEach(Book::displayBookInfo);
    }

    //CAL AVERAGE PRICE OF BOOKS USING STREAM -------------------------------
    public void calculateAveragePrice() {
        double averagePrice = books.stream()
                .mapToInt(book -> book.getMetadata().getPrice())
                .average()
                .orElse(0.0);
        System.out.println("Average Price: " + averagePrice);
    }

    // HIGHEST PRICE BOOK ---------------------------------------------------
    public void displayBookWithHighestPrice() {
        Book maxPricedBook = books.stream()
                .max(Comparator.comparingInt(book -> book.getMetadata().getPrice()))
                .orElse(null);
        if (maxPricedBook != null) {
            System.out.println("Book with Highest Price:");
            maxPricedBook.displayBookInfo();
        }
    }
    
    //FINDING BOOKS BY THEIR CATEGORIES USING STREAM AND COLLECTION -----------
    public void findBooksByCategory(String category) {
        List<Book> booksInCategory = books.stream()
                .filter(book -> book.getMetadata().getCategories().contains(category))
                .collect(Collectors.toList());
        booksInCategory.forEach(Book::displayBookInfo);
    }
}