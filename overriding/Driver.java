package overriding;

public class Driver {

	public static void main(String[] args) {
		Parent obj = new Parent();
		obj.show();
		
		// If a Parent type reference refers
        // to a Child object Child's show()
        // is called. This is called RUN TIME
        // POLYMORPHISM.
		Parent obj1 = new Child();
		obj1.show();

	}

}
