package com.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet map = new TreeSet();
		map.add("C");
		map.add("Java");
		map.add("Collection");
		map.add("AngularJs");
		map.add("JQuery");
		Iterator itr = map.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}

	}// tree Set use Default Comparator which is Ascending order means natural order

}
