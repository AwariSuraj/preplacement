package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveElement {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(15);
		list.add(25);
		list.add(35);
		list.add(45);

		list.remove(1);
		System.out.println(list);
		// list.removeAll(list);
		// System.out.println(list);
		Iterator<Integer> itr = list.iterator();

		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
	}

}
