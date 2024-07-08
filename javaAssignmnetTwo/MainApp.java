package javaAssignmnetTwo;

import java.io.IOException;

public class MainApp {

    public static void main(String[] args) {
        // Create a library
        Library<Media> library = new Library<>();
        
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_BLACK = "\u001B[30m";
        final String ANSI_RESET = "\u001B[0m";
        // File paths
        String bookJsonFilePath = "C:\\Users\\Maheen\\eclipse-workspace\\Assignment_2\\src\\main\\resources\\booksData.json";
        String audioBookJsonFilePath = "C:\\Users\\Maheen\\eclipse-workspace\\Assignment_2\\src\\main\\resources\\AudioBook.json";
        String magazineJsonFilePath = "C:\\Users\\Maheen\\eclipse-workspace\\Assignment_2\\src\\main\\resources\\MagazineData.json";
        String movieJsonFilePath = "C:\\Users\\Maheen\\eclipse-workspace\\Assignment_2\\src\\main\\resources\\MovieData.json";

        // Create processors
        BookProcessor bookProcessor = null;
        AudioBookProcessor audioBookProcessor = null;
        MagazineProcessor magazineProcessor = null;
        MovieProcessor movieProcessor = null;

        try {
            bookProcessor = new BookProcessor(bookJsonFilePath);
            audioBookProcessor = new AudioBookProcessor(audioBookJsonFilePath);
            magazineProcessor = new MagazineProcessor(magazineJsonFilePath);
            movieProcessor = new MovieProcessor(movieJsonFilePath);
        } catch (Exception e) {
            System.out.println("Error initializing processors: " + e.getMessage());
            e.printStackTrace();
            return;
        }

        // Display all media items
        System.out.println("<============= BOOKS =================>");
        System.out.println("Displaying all books:");
        bookProcessor.displayAllBooks();

        System.out.println( ANSI_BLACK+ "<============= AUDIO BOOKS =================>");
        System.out.println("Displaying all Audio books:");
        audioBookProcessor.displayAllBooks();

        System.out.println(ANSI_BLACK +"<============= MAGAZINES =================>");
        System.out.println("Displaying all Magazines:");
        magazineProcessor.displayAllMagazines();

        System.out.println(ANSI_BLACK +"<============= MOVIES =================>");
        System.out.println("Displaying all Movies:");
        movieProcessor.displayAllMovies();

        // Add a new magazine
        Magazine newMagazine = new Magazine("The New House", "Robert F.", 90.99);
        //Add new Audio Book
        AudioBook newBookAudio = new AudioBook("Good To Great", "Jim Collins",100.99);
        
        
        
        try {
            magazineProcessor.addMagazine(newMagazine);
            System.out.println(ANSI_GREEN+ "Magazine added successfully." + ANSI_RESET);
        } catch (IOException e) {
            System.out.println("Error adding magazine: " + e.getMessage());
        }
        try {
        	audioBookProcessor.addAdioBook(newBookAudio);
            System.out.println(ANSI_GREEN+ "Audio Book added successfully." + ANSI_RESET );
        } catch (IOException e) {
            System.out.println("Error adding magazine: " + e.getMessage());
        }

        // Update price of a magazine
        if (!magazineProcessor.getMagazines().isEmpty()) {
            Magazine magazineToUpdate = magazineProcessor.getMagazines().get(0); // Example: Get first magazine
            try {
                magazineProcessor.updateMagazinePrice(magazineToUpdate, 14.99);
                System.out.println(ANSI_GREEN +"Magazine price updated successfully." + ANSI_RESET);
            } catch (IOException e) {
                System.out.println("Error updating magazine price: " + e.getMessage());
            }
        } else {
            System.out.println("No magazines available to update.");
        }

        // Create some observers
        UserClass user1 = new UserClass("Ibrahim");
        UserClass user2 = new UserClass("Mahnoor");

        System.out.println(ANSI_BLACK +"<====================== OBSERVER LIST ===============================>" + ANSI_RESET);
        // Add observers to the library
        library.addObserver(user1);
        library.addObserver(user2);

        System.out.println("=> User1 : " + user1);
        System.out.println("=> User2 : " + user2);

        System.out.println(ANSI_BLACK + "<=============================================================>" + ANSI_RESET);
        // Add media items to the library
        library.addMedia(newMagazine);

        System.out.println(ANSI_BLACK + "<=============================================================>" + ANSI_RESET);

        // Update the price of a media item in the library
        library.updateMediaPrice(newMagazine, 4.99);
        System.out.println(ANSI_BLACK + "<=============================================================>" + ANSI_RESET);
        
        
        System.out.println(ANSI_BLACK +"<============= MAGAZINES AFTER ADDITION =================>" + ANSI_RESET);
        System.out.println("Displaying all Magazines:");
        magazineProcessor.displayAllMagazines();
        
        System.out.println(ANSI_BLACK +"<============= AUDIO BOOKS AFTER ADDITION =================>" + ANSI_RESET);
        System.out.println("Displaying all Audio Books:");
        audioBookProcessor.displayAllBooks();
        
        
    }
}