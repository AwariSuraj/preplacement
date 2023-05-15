package com.interfaces1;

interface Student

{
	void addStudent();

	void deleteStudent();

}

class StudentDao implements Student {
	public void addStudent() {
		System.out.println("student added Successfully");
	}

	public void deleteStudent() {
		System.out.println("student delete  successfully");
	}

	public void showDetails() {
		System.out.println(" All Students are Technically good");
	}
}

public class ContracutalAggrement {

	public static void main(String[] args) {

		Student s = new StudentDao();
		s.addStudent();
		s.deleteStudent();
		// s.showDetails(); // because of the contracutal agrrement;

	}

}
