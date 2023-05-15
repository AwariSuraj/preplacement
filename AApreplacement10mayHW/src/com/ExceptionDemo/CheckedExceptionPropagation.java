package com.ExceptionDemo;

import java.io.IOException;

public class CheckedExceptionPropagation {

	public void method1() throws IOException {
		throw new IOException(" exception Occured");
	}

	public void method2() throws IOException {
		method1();
	}

	public void method3() throws IOException {
		method2();
	}

	public static void main(String[] args) {

		CheckedExceptionPropagation c = new CheckedExceptionPropagation();
		try {
			c.method3();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
