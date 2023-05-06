package AccessModifier;

class Vehicle {
	private String name = "fourwheeler";
	protected String type = "racing";
	public String engine = " diesel";
}

class Car extends Vehicle {
	int speed = 400;
}

public class Modifiers {

	public static void main(String[] args) {

		Car c = new Car();
		// System.out.println(c.name); name =private
		System.out.println(c.type);// protected

	}

}
