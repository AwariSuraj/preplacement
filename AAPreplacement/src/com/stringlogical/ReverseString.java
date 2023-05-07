package com.stringlogical;

public class ReverseString {

	public static void reverse(String s1) {

		for (int i = s1.length(); i > 0; i--) {
			System.out.print(s1.charAt(i - 1));

		}

	}

	public static void main(String[] args) {

		String s = "suraj Awari";
		reverse(s);
	}

}
