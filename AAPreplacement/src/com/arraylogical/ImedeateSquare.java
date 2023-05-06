package com.arraylogical;

import java.util.Arrays;

public class ImedeateSquare {

	public static void replaceNegative(int ar[]) {
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] < 0) {
				int a = ar[i - 1];
				ar[i] = a * a;
			}
		}
		System.out.println("After");
		System.out.println(Arrays.toString(ar));
	}

	public static void main(String[] args) {
		int arr[] = { 12, 3, -19, 29, 5, -61, 44, 7, -9 };
		System.out.println("Before");
		System.out.println(Arrays.toString(arr));
		replaceNegative(arr);

	}

}
