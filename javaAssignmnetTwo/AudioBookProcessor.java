package javaAssignmnetTwo;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AudioBookProcessor {
	
	    private List<AudioBook> audiobooks;  //creating an audiobook list
	    private String jsonFilePath;
	    public AudioBookProcessor(String jsonFilePath) {
	        this.jsonFilePath = jsonFilePath;
	        try {
	            Gson gson = new Gson();
	            Type bookListType = new TypeToken<List<AudioBook>>() {}.getType();
	            audiobooks = gson.fromJson(new FileReader(jsonFilePath), bookListType); //json file that need to be parsed 
	        } catch (IOException e) {
	            System.out.println("Error reading JSON file: " + e.getMessage()); //using exception handling 
	        }
	    }

	    // Display all audiobooks ---------------------------------------------------
	    public void displayAllBooks() {
	        audiobooks.forEach(AudioBook::displayAudioBookInfo);
	    }
	    
	    // Find audiobooks by author -------------------------------------------------
	    public void findBooksByAuthor(String author) {
	        List<AudioBook> booksByAuthor = audiobooks.stream()
	                .filter(book -> book.getAuthor().equalsIgnoreCase(author))
	                .collect(Collectors.toList());
	        booksByAuthor.forEach(AudioBook::displayAudioBookInfo);
	    }

	    // Calculate average price of audiobooks using streams ----------------------
	    public void calculateAveragePrice() {
	        double averagePrice = audiobooks.stream()
	                .mapToDouble(book -> book.getMetadata().getPrice())
	                .average()
	                .orElse(0.0);
	        System.out.println("Average Price: " + averagePrice);
	    }

	    // Display audiobook with highest price -------------------------------------
	    public void displayBookWithHighestPrice() {
	        AudioBook maxPricedBook = audiobooks.stream()
	                .max(Comparator.comparingDouble(book -> book.getMetadata().getPrice()))
	                .orElse(null);
	        if (maxPricedBook != null) {
	            System.out.println("Audio Book with Highest Price:");
	            maxPricedBook.displayAudioBookInfo();
	        }
	    }
	    
	    // Find audiobooks by category using streams and collections ----------------
	    public void findBooksByCategory(String category) {
	        List<AudioBook> booksInCategory = audiobooks.stream()
	                .filter(book -> book.getMetadata().getCategories().contains(category))
	                .collect(Collectors.toList());
	        booksInCategory.forEach(AudioBook::displayAudioBookInfo);
	    }
	 // Method to add a new magazine
	    public void addAdioBook(AudioBook audiobook) throws IOException {
	    	audiobooks.add(audiobook);
	        writeToJsonFile();
	    }

	    // Method to update the price of an existing magazine
	    public void updateMagazinePrice(AudioBook audiobook, double newPrice) throws IOException {
	        for (AudioBook m : audiobooks) {
	            if (m.equals(audiobook)) {
	                m.updatePrice(newPrice);
	                break;
	            }
	        }
	        writeToJsonFile();
	    }

	    // Method to write magazines list to JSON file
	    private void writeToJsonFile() throws IOException {
	        Gson gson = new Gson();
	        try (FileWriter writer = new FileWriter(jsonFilePath)) {
	            gson.toJson(audiobooks, writer);
	        }
	    }

	    // Method to get the list of magazines
	    public List<AudioBook> getAudioBook() {
	        return audiobooks;
	    }
	
}