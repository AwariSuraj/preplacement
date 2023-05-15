package com.ExceptionDemo;

class CheckNumberException extends Exception {

	CheckNumberException() {

	}

	CheckNumberException(String str) {
		super(str);
	}
}

public class ExplicitException {

	public static void main(String[] args) {

		int num = 5;
		if (num < 10)
			try {
				throw new CheckNumberException("entered wrong number");
			} catch (CheckNumberException e) {
				System.out.println(e);
			}

	}

}
