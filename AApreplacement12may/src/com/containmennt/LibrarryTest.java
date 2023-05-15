package com.containmennt;

import java.util.Scanner;

public class LibrarryTest {
	static Scanner sc = new Scanner(System.in);

	public static void detailsOfLibrary(Library li) {

		System.out.println("enter a book type");
		li.setTypeOfBooks(sc.next());
		System.out.println("enter a library name");
		li.setLibName(sc.next());
		Book b[] = new Book[2];

		bookDetails(b);
		li.setBooks(b);

	}

	public static void bookDetails(Book b1[]) {

		System.out.println("enter a book details");
		for (int i = 0; i < 2; i++) {
			b1[i] = new Book();
			System.out.println(" enter book id");

			b1[i].setBookId(sc.nextInt());
			System.out.println("enter book price");
			b1[i].setPrice(sc.nextFloat());

		}
	}

	public static void main(String[] args) {

		Library lib = new Library();
		detailsOfLibrary(lib);

		System.out.println(lib);
		float prices = 0;
		for (Book b : lib.getBooks()) {

			if (prices < b.getPrice()) {
				prices = b.getPrice();

			}

		}
		for (Book b1 : lib.getBooks()) {

			if (prices == b1.getPrice()) {
				System.out.println(b1);
			}
		}
		System.out.println(prices);
	}

}
