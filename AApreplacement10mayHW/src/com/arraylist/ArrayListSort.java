package com.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Employee implements Comparable<Employee> {
	private int empId;
	private String name;

	Employee() {

	}

	Employee(int empId, String name) {
		this.empId = empId;
		this.name = name;

	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + "]";
	}

	public int compareTo(Employee e) {
		if (this.empId == e.empId) {
			return 0;

		} else {
			if (this.empId > e.empId) {
				return 1;
			} else
				return -1;
		}

	}

}

public class ArrayListSort {
	public static void main(String[] args) {
		ArrayList<Employee> alEmp = new ArrayList<>();
		Employee e1 = new Employee(3, "Ajit");
		Employee e2 = new Employee(4, "Suman");
		Employee e3 = new Employee(2, "Radhika");
		Employee e4 = new Employee(1, "Sameer");
		alEmp.add(e1);
		alEmp.add(e2);
		alEmp.add(e3);
		alEmp.add(e4);
		System.out.println(" Id Comparator");
		Collections.sort(alEmp);

		Iterator<Employee> itr = alEmp.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("...........................................................");
		System.out.println(" Name Comparator ");
		Collections.sort(alEmp, new NameComparator());
		Iterator<Employee> itr1 = alEmp.iterator();

		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}
	}

}
