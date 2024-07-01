package Test;

import java.util.Scanner;

public class Functions {
	String RESET = "\u001B[0m";
    static String RED = "\u001B[31m";
    static String GREEN = "\u001B[32m";
    static String YELLOW = "\u001B[33m";
    static Scanner userInput = new Scanner(System.in);
    static String name = " ";
    static int marks = 0;
	public static void main(String[] args) {
		
		 getDetails();	
		 showDetails();
		 System.out.println("The addtion answer : ");
		 int c =addTwoValues(1,2);
		 System.out.println(c);
		 System.out.println("Taking modulus : ");
		 int b =takingMode(17,45);
		 System.out.println(b);
		 

	}
	public static void getDetails() {
		
		System.out.println(RED +"Enter Name of the student: ");
		name = userInput.nextLine();
		System.out.println(RED +"Enter Marks of the student:");
		marks = userInput.nextInt();
		
	}
	public static void showDetails() {
		
		System.out.println(GREEN + "=> Name of the student : " + name);
		System.out.println(YELLOW +"=> Marks of the student : " + marks);
		
	}
	public static int addTwoValues(int a,int b)
	{
		int c;
		c= a+b;
		return c;
	}
	public static int takingMode(int a,int b)
	{
		 // Check for valid divisor
	    if (b == 0) {
	        throw new ArithmeticException("Division by zero");
	    }
	    // Calculate the remainder
	    int remainder = a % b;
	    // Handle negative results to always return a positive remainder
	    if (remainder < 0) {
	        remainder += b;
	    }
	    return remainder;
	}
	//try and catch for error handling
}
