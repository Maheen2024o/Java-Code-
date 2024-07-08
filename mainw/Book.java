package mainw;


import java.util.List;

public class Book {
	
    private String title;
    private String author;
    private Metadata metadata;
    
    //constructor
    public Book(String title, String author, Metadata metadata) {
        this.title = title;
        this.author = author;
        this.metadata = metadata;
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
    public void displayBookInfo() {
    	// ANSI escape codes for colors
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_YELLOW = "\u001B[33m";
        final String ANSI_BLUE = "\u001B[34m";
        final String ANSI_PURPLE = "\u001B[35m";
        final String ANSI_CYAN = "\u001B[36m";

        System.out.println(ANSI_YELLOW + "<========================================================>");
        System.out.println(ANSI_RED + "=> Title: " + title + ANSI_RESET);
        System.out.println(ANSI_GREEN + "=> Author: " + author + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "=> Price: " + metadata.getPrice() + ANSI_RESET);
        System.out.println(ANSI_BLUE + "=> Categories: " + String.join(", ", metadata.getCategories()) + ANSI_RESET);
        System.out.println(ANSI_PURPLE + "=> ISBN: " + metadata.getIsbn() + ANSI_RESET);
        System.out.println(ANSI_CYAN + "=> Pages: " + metadata.getPages() + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "<========================================================>");
    }

    public static class Metadata {
        private int price;
        private List<String> categories;
        private String isbn;
        private int pages;

      //constructor
        public Metadata(int price, List<String> categories, String isbn, int pages) {
            this.price = price;
            this.categories = categories;
            this.isbn = isbn;
            this.pages = pages;
        }

        //getters and setters for Metadata 
        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
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

        public int getPages() {
            return pages;
        }

        public void setPages(int pages) {
            this.pages = pages;
        }
    }
}

