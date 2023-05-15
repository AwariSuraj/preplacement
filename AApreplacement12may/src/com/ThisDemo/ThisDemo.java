package com.ThisDemo;

class Numbers {

	int num1, num2, num3, num4;

	Numbers() {
		this.num1 = 12;
		this.num2 = 4;
		this.num3 = 10;
		this.num4 = 50;

	}

	Numbers(int num1, int num2) {
		this();
		this.num1 = num1;
		this.num2 = num2;

	}

	Numbers(int num3) {

		this(50, 10);
		this.num3 = num3;

	}

	public void display() {
		this.show();
	}

	public void show() {
		System.out.println(num1 + " " + num2 + " " + num3 + " " + num4);
	}

	public Numbers details() {

		return this;
	}

	public void addObj(Numbers n) {
		this.num1 = this.num1 + n.num1;
		this.num2 = this.num2 + n.num2;
	}
}

public class ThisDemo {

	public static void main(String[] args) {

		Numbers n1 = new Numbers();
		Numbers n2;
		n2 = n1.details();
		n2.display();

		n1.display();

	}

}
