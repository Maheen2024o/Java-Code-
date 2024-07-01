package Test;

import java.util.Scanner;

public class statements {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Please Enter a random number : ");
		int randomNumber = userInput.nextInt();
	
		if (randomNumber < 25)
		{
			System.out.println("THE RANDOM NUMBER IS LESS THAN 25");
		}
		else if(randomNumber > 40)
		{
			System.out.println("THE RANDOM NUMBER IS greater THAN 40");
		}
		else if(randomNumber == 18)
		{
			System.out.println("THE RANDOM NUMBER IS equal to 18");
		}
		else if(randomNumber != 18)
		{
			System.out.println("THE RANDOM NUMBER IS not equal to 18");
		}
		else
		{
			System.out.println("Nothing worked");
		}
		
		System.out.println("The random number is "+ randomNumber);
		
		if(!(false))
		{
			System.out.println("\n turned false into true");
		}
		if((false) && (true))
		{
				System.out.println("\n if both conditions are true then.");
			}
		
		System.out.println("Please Enter a choice like (GRAPE) : ");
		System.out.println("1. APPLE \n2. FRUIT \n3. GRAPE ");
		int choi = userInput.nextInt();
		
		switch(choi) 
		{
		case 1:
			System.out.println("\nSelected the option 1.");
			break;
		case 2:
			System.out.println("\nSelected the option 2.");
			break;
		case 3:
			System.out.println("\nSelected the option 3.");
			break;
		default:
			System.out.println("Failed");
			break;
		}
		
		
		
	}
		
}
	
	
	


