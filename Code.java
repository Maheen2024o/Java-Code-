package Test;

import java.util.Scanner;

public class Code {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		//primitive data-types
		byte bigByte = 127;
		short bigShort =  32767;
		int bigInt = 2100000000;
		long bigLong = 9220000000000000000L;
		float bigFloat = 3.14F;
		double bigDouble = 3.1481929837381910019292991992;
		String name = " ";
		int marks = 0;
		System.out.println(Float.MAX_VALUE);
		System.out.println(Double.MAX_VALUE);
		//reference data types
		
		char[] a = new char[4];
        a[0] = 'a';
        a[1] = 'b';
        a[2] = 'c';
        a[3] = 'd';
        
        for(int i=0; i<=3; i++)
        {
        	System.out.println(a[i]);
        }
		
		boolean trueOrFalse = true;
		int randomNumber = 18;
		char randomChar = 66;
		char anotherChar = 'A';
		
		char escapedChars= '\\';
		
		//Taking input
		System.out.println("\nEnter Name of the student ");
		name = userInput.nextLine();
		System.out.println("Enter Marks of the student ");
		marks = userInput.nextInt();

	}

}
