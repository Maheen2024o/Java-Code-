package Test;

import java.util.Scanner;

public class TestProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        char[] a = new char[4];
        a[0] = 'a';
        a[1] = 'b';
        a[2] = 'c';
        a[3] = 'd';
        int[] array = new int [10];
        TestProject obj = new TestProject();
        Scanner userInput = new Scanner(System.in);
        int x=10;
        int y =20;
        
        
        
        for(int i=0; i<=3; i++)
        {
        	System.out.print(a[i]);
        }
        System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        
       
        for(int i=0; i<10; i++)
        {
        	array[i]= i;
        }
        
        for(int i=0; i<10; i++)
        {
        	System.out.print(array[i]);
        }
        System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        
        /*Student obj1 = new Student();
        obj1.getDetails();
        obj1.showDetails();*/
        
        System.out.println("Enter cost of vehical");
        int vehicle_cost = userInput.nextInt();
        
        System.out.println("Enter Mileage of vehical");
        int vehicle_Mileage = userInput.nextInt();
        
        System.out.println("Enter color of vehical");
        String car_color = userInput.next();
        
        System.out.println("Enter Tyres of vehical");
        int car_tyres = userInput.nextInt();
        
        Car obj3 = new Car(vehicle_cost,vehicle_Mileage,car_color,car_tyres );
        
        obj3.show_car_details();
        obj3.show_vehical_details();
        
	}
	
	

}
