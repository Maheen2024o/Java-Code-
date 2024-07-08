package javaAssignmnetTwo;

public class UserClass implements LibraryObserver {
	private String name;

    public UserClass(String name) {
        this.name = name;
    }

    @Override
    public void updateEvent(LibraryEvent event) {
        System.out.println(name + " received notification: " + event);
    }
}
