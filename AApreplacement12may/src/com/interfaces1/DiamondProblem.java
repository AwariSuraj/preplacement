package com.interfaces1;

interface Student1 {
	public void show();

	default void details() {
		System.out.println("i am a student");
	}

	static void ageLimit() {
		System.out.println(" students age limit between 10  to  20 ");
	}
}

interface Teacher {
	public void show();

	default void details() {
		System.out.println("i am a Teacher ");
	}

	static void ageLimit() {
		System.out.println(" Teachers age limit between 25  to  58 ");
	}
}

class Diamond1 implements Student1, Teacher {
	public void show() {
		System.out.println(" i am in diamond problem");
	}

	@Override
	public void details() {

		Student1.super.details();
	}

}

public class DiamondProblem {

	public static void main(String[] args) {

		Diamond1 d1 = new Diamond1();
		d1.details();
		d1.show();
		Student1.ageLimit();
		Teacher.ageLimit();
	}

}
