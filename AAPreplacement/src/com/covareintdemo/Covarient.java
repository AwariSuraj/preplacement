package com.covareintdemo;

class Vehicle {

	int speed;
	{
		speed = 100;
	}

	Vehicle increaseSpeed() {
		speed = speed + 50;
		return this;
	}

	void display() {
		System.out.println("speed=" + speed);
	}
}

class Car extends Vehicle {
	{
		speed = 300;

	}

	Car increaseSpeed() {

		speed = speed + 50;
		return this;

	}

	void display() {
		System.out.println("speed=" + speed);
	}
}

public class Covarient {

	public static void main(String[] args) {

		Car c;
		Car bmd = new Car();
		Car oddi = new Car(); // we are using covarient return type to stay away from type casting
								// during class hierarchy

		c = bmd.increaseSpeed();
		c.display();
	}

}
