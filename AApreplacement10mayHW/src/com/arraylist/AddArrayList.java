package com.arraylist;

import java.util.ArrayList;

public class AddArrayList {
	public static void addAll(ArrayList<Integer> list1) {
		int sum = 0;
		for (Integer i : list1) {
			sum = sum + i;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(15);
		list.add(25);
		list.add(35);
		list.add(45);
		addAll(list);
	}

}
