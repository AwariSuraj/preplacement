package com.arraylogical;

import java.util.Arrays;

public class HalfSorting {

	public static void sorting(int ar[]) {
		for (int i = 0; i < ar.length / 2; i++) {
			for (int j = 0; j < ar.length / 2; j++) {
				if (ar[i] < ar[j]) {
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}
		for (int k = ar.length / 2; k < ar.length; k++) {
			for (int l = ar.length / 2; l < ar.length; l++) {
				if (ar[k] > ar[l]) {
					int temp = ar[k];
					ar[k] = ar[l];
					ar[l] = temp;
				}
			}
		}
		System.out.println("after");
		System.out.println(Arrays.toString(ar));
	}

	public static void main(String[] args) {
		int arr[] = { 3, 90, 45, 29, 37, 78 };
		System.out.println("before");
		System.out.println(Arrays.toString(arr));
		sorting(arr);
	}

}
