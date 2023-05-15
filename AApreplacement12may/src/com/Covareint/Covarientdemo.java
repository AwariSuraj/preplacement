package com.Covareint;

class Vehicle {
	int speed;

	{
		speed = 200;
	}

	Vehicle show() {

		return this;

	}

	void display() {
		System.out.println(speed);
	}

}

class Car extends Vehicle {
	{
		speed = 200;

	}

	Car show() {
		speed = speed + 100;
		return this;
	}

	void display() {
		System.out.println(speed);
	}
}

public class Covarientdemo {

	public static void main(String[] args) {

		Car c;

		Car bmw = new Car();

		// c = (Car) bmw.show(); // when return type is same in the child class like
		// parent class
		c = bmw.show();
		c.display();
	}

}
