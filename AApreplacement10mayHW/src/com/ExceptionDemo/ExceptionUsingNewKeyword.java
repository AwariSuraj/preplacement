package com.ExceptionDemo;

import java.io.IOException;

public class ExceptionUsingNewKeyword {

	public static void main(String[] args) {
		int num = 5;
		int ans;

		if (num < 10) {
			try {
				throw new IOException("num is small");

			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}
}
