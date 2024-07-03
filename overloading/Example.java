package overloading;

public class Example {
	static int plusMethod(int a, int b)
	{
		return a+b;
	}
	static double plusMethod(double a ,double b)
	{
		return a+b;
	}
	public static void main(String[] args) {
		int num1= plusMethod(2,3);
		double num2 = plusMethod(4.5,6.5);
		
		System.out.println("int : "+ num1);
		System.out.println("double : "+ num2);

	}

}
