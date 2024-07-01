package Test;

public class Vehical{
	String RESET = "\u001B[0m";
    String RED = "\u001B[31m";
    String GREEN = "\u001B[32m";
    String YELLOW = "\u001B[33m";
	int cost = 0;
	int mileage = 0;
	public Vehical(int c, int m)
	{
		cost =c;
		mileage = m;
		
	}
	public void show_vehical_details()
	{
		System.out.println(GREEN + "=> Mileage of Vehical : " + mileage);
		System.out.println(YELLOW +"=> cost of vehical : " + cost);
	}

}
