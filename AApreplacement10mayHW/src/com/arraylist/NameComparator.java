package com.arraylist;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee> {

	public int compare(Employee e1, Employee e2) {
		return (int) (e1.getName().compareTo(e2.getName()));
	}

}
