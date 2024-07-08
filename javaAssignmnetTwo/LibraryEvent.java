package javaAssignmnetTwo;

public class LibraryEvent {
	private String eventType;
    private Media media;

    public LibraryEvent(String eventType, Media media) {
        this.eventType = eventType;
        this.media = media;
    }

    public String getEventType() {
        return eventType;
    }

    public Media getMedia() {
        return media;
    }

    @Override
    public String toString() {
    	final String ANSI_CYAN = "\u001B[36m";
        return "=> Event Type: " + eventType + ", Media: " + media.toString()+ANSI_CYAN ;
    }
}
