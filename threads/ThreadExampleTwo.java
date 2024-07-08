package threads;

public class ThreadExampleTwo extends Thread {
	public static void main(String[] args) {
			ThreadExampleTwo thread = new ThreadExampleTwo();
		    thread.start();
		    System.out.println("This code is outside of the thread");
		  }
		  public void run() {
		    System.out.println("This code is running in a thread");
		  }
		
}
