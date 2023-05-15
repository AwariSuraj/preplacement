package com.string;

public class StringDemo {

	public static void main(String[] args) {
		String s1 = "java";
		String s3 = "java";
		String s2 = new String("java");
		System.out.println("   ==  ");
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);

		System.out.println(".equals()");
		System.out.println(s1.equals(s2));

	}

}
