package Test;

public class Car extends Vehical  {

	String color = " ";
	int tyres = 0;
		public Car(int c, int m, String col, int tyre) {
		super(c, m);
		color = col;
		tyres = tyre;
		
		
	}

		
		
		public void show_car_details() {
			System.out.println(GREEN + "=> Car color is  : " + color);
			System.out.println(YELLOW +"=> Car tyres are : " + tyres);
		}
		

}
