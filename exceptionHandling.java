package Test;
import java.util.*;
import java.io.*;

public class exceptionHandling {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		//Arithmetic Exception
		
		//divideByZero(2);
		/*System.out.println("What's your age? ");
		int age = checkValidAge();
		if (age != 0) {
			System.out.println("your age is "+ age);
		}*/
		//file exception handling
		getAFile("./Code.java");
		
		

	}
	
	public static void getAFile(String filename)
	{
		try {
			FileInputStream file = new FileInputStream(filename);
		}
		catch(FileNotFoundException e){
			System.out.println("File not found.");
		}
		//IO exception handling
		catch (IOException e) {
			System.out.println("Unknown IO Error");
		}
		//we can also use logical operators with these expressions in exception.
		//catch(ClassNotFoundException e ) {}
		catch(Exception e)
		{
			System.out.println("some error occurred");
		}
	}
	public static int checkValidAge()
	{
		try
		{
			return scan.nextInt();
		}
		catch (InputMismatchException e)
		{
			scan.next();
			System.out.print("That is not a whole number");
			return 0;
			
		}
	}
	public static void divideByZero(int a)
	{
		try
		{
			System.out.println(a/0);
		}
		catch (ArithmeticException e)
		{
			System.out.println("You can't do this.");
			System.out.println (e.getMessage());
			System.out.println(e.toString());
			System.out.println("TRACE");
			e.printStackTrace();
		}
	}
	

}
