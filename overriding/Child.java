package overriding;

public class Child extends Parent {
	@Override void show()
	{
		System.out.println("I am in Child class. ");
	}
}
