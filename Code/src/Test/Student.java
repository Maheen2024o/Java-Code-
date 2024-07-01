package Test;

import java.util.Scanner;

public class Student {
	String RESET = "\u001B[0m";
    String RED = "\u001B[31m";
    String GREEN = "\u001B[32m";
    String YELLOW = "\u001B[33m";
	Scanner userInput = new Scanner(System.in);
	String name = " ";
	int marks = 0;
	
	public void getDetails() {
		
		System.out.println("Enter Name of the student ");
		name = userInput.nextLine();
		System.out.println("Enter Marks of the student ");
		marks = userInput.nextInt();
		
	}
	public void showDetails() {
		
		System.out.println(GREEN + "=> Name of the student : " + name);
		System.out.println(YELLOW +"=> Marks of the student : " + marks);
		
	}

}
