package com.interfaces1;

interface Keyboard {

	public void keyboardDetails();
}

class DellComputer implements Keyboard {

	public void keyboardDetails() {
		System.out.println("Dell  computers keyboard working");
	}
}

class LenovoComputer implements Keyboard {

	public void keyboardDetails() {
		System.out.println(" lenevo computers keyboard working");
	}
}

public class LooseCoupling {

	public void keyboardsDetails(Keyboard k)

	{
		k.keyboardDetails();
	}

	public static void main(String[] args) {

		LooseCoupling l = new LooseCoupling();

		DellComputer d = new DellComputer();
		LenovoComputer le = new LenovoComputer();

		l.keyboardsDetails(d);
		l.keyboardsDetails(le);
	}

}
