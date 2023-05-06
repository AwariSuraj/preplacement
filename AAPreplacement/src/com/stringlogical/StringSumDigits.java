package com.stringlogical;

public class StringSumDigits {

	public static void sumDigit(String s1) {
		char ch[] = s1.toCharArray();
		int sum = 0;
		for (int i = 0; i < ch.length; i++) {

			if (ch[i] > '0' && ch[i] < '9') {
				sum = sum + ch[i] - 48;
			}

		}
		System.out.println("sum of digits =" + sum);
	}

	public static void main(String[] args) {

		String s = "a2855fr5";
		sumDigit(s);

	}

}
