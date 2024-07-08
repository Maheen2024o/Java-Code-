package javaAssignmnetTwo;

import java.util.List;

import com.google.gson.Gson;


//Implementing the Media interface for the Magazine class
public class Magazine implements Media {

	    private String title;
	    private String author;
	    private Metadata metadata;
		private double price;

	    public Magazine(String title, String author, int price, List<String> categories, String issn, int pages) {
	        this.title = title;
	        this.author = author;
	        this.metadata = new Metadata(price, categories, issn, pages);
	    }
	
	 // Constructor to initialize the price of the magazine
	 public Magazine(double price) {
	     this.price = price;
	 }
	
	 // Implementation of the updatePrice method from the Media interface
	 // This method sets the new price of the magazine
	 @Override
	 public void updatePrice(double newPrice) {
	     this.price = newPrice;
	 }
	
	 // Implementation of the getPrice method from the Media interface
	 // This method returns the current price of the magazine
	 @Override
	 public double getPrice() {
	     return this.price;
	 }
	
	 // Override the toString method to provide a string representation of the magazine
	 // Adding ANSI_CYAN for cyan colored output in terminal
	 @Override
	 public String toString() {
	     final String ANSI_CYAN = "\u001B[36m";
	     return "=> Magazine with price: " + this.price + ANSI_CYAN;
	 }
	//constructor
	    public Magazine(String title, String author, double price) {
	        this.title = title;
	        this.author = author;
	        this.price = price;
	    }
	    //get the title
	    public String getTitle() {
	        return title;
	    }
	    //set the title
	    public void setTitle(String title) {
	        this.title = title;
	    }
	    //get the Author
	    public String getAuthor() {
	        return author;
	    }
	    //set the Author
	    public void setAuthor(String author) {
	        this.author = author;
	    }
	    //get the Metadata
	    public Metadata getMetadata() {
	        return metadata;
	    }
	    //set the Metadata
	    public void setMetadata(Metadata metadata) {
	        this.metadata = metadata;
	    }

	    //display the book info that is parsed 
	    public void displayMagazineInfo() {
	        // ANSI escape codes for colors
	        final String ANSI_RESET = "\u001B[0m";
	        final String ANSI_RED = "\u001B[31m";
	        final String ANSI_GREEN = "\u001B[32m";
	        final String ANSI_YELLOW = "\u001B[33m";
	        final String ANSI_BLUE = "\u001B[34m";
	        final String ANSI_PURPLE = "\u001B[35m";
	        final String ANSI_CYAN = "\u001B[36m";

	        System.out.println(ANSI_YELLOW + "<========================================================>"+ ANSI_RESET);
	        System.out.println(ANSI_RED + "=> Title: " + title + ANSI_RESET);
	        System.out.println(ANSI_GREEN + "=> Author: " + author + ANSI_RESET);
	        if (metadata != null) {
	            System.out.println(ANSI_YELLOW + "=> Price: " + metadata.getPrice() + ANSI_RESET);
	            System.out.println(ANSI_BLUE + "=> Categories: " + (metadata.getCategories() != null ? String.join(", ", metadata.getCategories()) : "N/A") + ANSI_RESET);
	            System.out.println(ANSI_PURPLE + "=> ISBN: " + (metadata.getIsbn() != null ? metadata.getIsbn() : "N/A") + ANSI_RESET);
	            System.out.println(ANSI_CYAN + "=> Pages: " + metadata.getDuration() + ANSI_RESET);
	        } else {
	            System.out.println("Metadata: N/A");
	        }
	        System.out.println(ANSI_YELLOW + "<========================================================>" + ANSI_RESET);
	    }

	    public static class Metadata {
	        private double price;
	        private List<String> categories;
	        private String isbn;
	        private int  duration;

	      //constructor
	        public Metadata(double price, List<String> categories, String isbn, int  duration) {
	            this.price = price;
	            this.categories = categories;
	            this.isbn = isbn;
	            this. duration =  duration;
	        }

	        //getters and setters for Metadata 
	        public double getPrice() {
	            return price;
	        }

	        public void setPrice(double price) {
	            this.price = price;
	        }

	        public List<String> getCategories() {
	            return categories;
	        }

	        public void setCategories(List<String> categories) {
	            this.categories = categories;
	        }

	        public String getIsbn() {
	            return isbn;
	        }

	        public void setIsbn(String isbn) {
	            this.isbn = isbn;
	        }

	        public int getDuration() {
	            return  duration;
	        }

	        public void setPages(int duration) {
	            this. duration =  duration;
	        }
	        
	        // Method to update the price of the magazine
	        public void updatePrice(double newPrice) {
	            this.price = newPrice;
	        }

	        // Method to convert Magazine object to JSON string
	        public String toJson() {
	            Gson gson = new Gson();
	            return gson.toJson(this);
	        }
	        
	        
	    }
	 
	 
}
