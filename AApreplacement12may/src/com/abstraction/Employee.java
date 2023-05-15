package com.abstraction;

abstract class Employe {
	int id;
	String name;
	int salary;

	Employe() {

	}

	Employe(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	abstract void details();

}

class Developer extends Employe {

	int perks;
	String language;

	Developer() {

	}

	Developer(int id, String name, int salary, int perks, String language) {
		super(id, name, salary);
		this.perks = perks;
		this.language = language;
	}

	void details() {
		System.out.println("id=" + id + " " + "name=" + name + " " + "salary=" + salary + " " + " perks =" + perks + " "
				+ " language=" + language);
	}

	void insurance() {
		System.out.println("insurance = " + salary * 0.2);
	}

}

public class Employee {
	public static void main(String args[]) {

		Employe d = new Developer();

		d.details();
		// d.insurance();
	}

}
