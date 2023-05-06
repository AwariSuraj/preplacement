package com.arraylogical;

import java.util.Arrays;

public class ReverseArray {

	public static void reverse(int ar[]) {
		for (int i = 0, j = ar.length - 1; i < ar.length / 2; i++, j--) {
			int temp;
			temp = ar[i];
			ar[i] = ar[j];
			ar[j] = temp;

		}
		System.out.println("After");
		System.out.println(Arrays.toString(ar));
	}

	public static void main(String[] args) {
		int arr[] = { 3, 90, 45, 29, 37, 78 };
		System.out.println("Before");
		System.out.println(Arrays.toString(arr));
		reverse(arr);

	}

}
