package com.array;

import java.util.Arrays;

public class ReverseArray {
	public static void reverse(int ar[]) {
		for (int i = 0, j = ar.length - 1; i < ar.length / 2; i++, j--) {

			int temp;
			temp = ar[i];
			ar[i] = ar[j];
			ar[j] = temp;
		}
		System.out.println(Arrays.toString(ar));
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 5, 6, 8 };
		reverse(arr);

	}

}
