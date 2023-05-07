package com.usageOfThis;

class UseThis {

	public int num1;
	public int num2;
	public int num3;

	UseThis() {

	}

	UseThis(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;

	}

	UseThis(int num1, int num2, int num3) {
		this(num1, num2);
		this.num3 = num3;

	}

	public void display() {
		this.show();
	}

	public void show() {
		System.out.println(num1 + "   " + num2 + "  " + num3);
	}

}

public class ThisDemo {

	public static void main(String[] args) {

		UseThis t = new UseThis(12, 52);
		t.display();
		System.out.println("-----------------");
		UseThis t1 = new UseThis(12, 52, 56);
		t1.display();
	}

}
