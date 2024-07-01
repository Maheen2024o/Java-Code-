package Test;
import java.util.Scanner;


public class JavaLessontwo {
	
	static Scanner userInput = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.print("your fav number: ");
		if(userInput.hasNextInt())
		{
			int numberEnter = userInput.nextInt();
			System.out.println("you entered "+ numberEnter);
			int Entertime2 = numberEnter + numberEnter;
			System.out.println( numberEnter + "+" +  numberEnter   +" = "+ Entertime2);
			
		}
		else
		{
			System.out.println("Only integer input required.");
		}
	}

}
