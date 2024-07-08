package javaAssignmnetTwo;
import java.util.ArrayList;
import java.util.List;
public class Library<T extends Media> {

	    private List<T> mediaItems;
	    private List<LibraryObserver> observers;
	    final String ANSI_GREEN = "\u001B[32m";

	    public Library() {
	        this.mediaItems = new ArrayList<>();
	        this.observers = new ArrayList<>();
	    }

	    public void addMedia(T media) {
	        mediaItems.add(media);
	       
	        notifyObservers(new LibraryEvent("<<-- MEDIA ADDED -->>"+ ANSI_GREEN  , media));
	    }

	    public void updateMediaPrice(T media, double newPrice) {
	        media.updatePrice(newPrice);
	        notifyObservers(new LibraryEvent("<<-- PRICE UPDATED -->>"+ ANSI_GREEN , media));
	    }

	    public void addObserver(LibraryObserver observer) {
	        observers.add(observer);
	    }

	    private void notifyObservers(LibraryEvent event) {
	        for (LibraryObserver observer : observers) {
	            observer.updateEvent(event);
	        }
	    }
	
}
