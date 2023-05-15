package com.containmennt;

public class LibrarytestHardCode {

	public static void main(String[] args) {
		Library lib = new Library();

		Book b[] = new Book[3];

		b[0] = new Book(101, 500);
		b[1] = new Book(102, 300);
		b[2] = new Book(103, 200);

		lib.setBooks(b);

		System.out.println(lib);
		float prices = 0;
		for (Book b1 : lib.getBooks()) {

			if (prices < b1.getPrice()) {
				prices = b1.getPrice();

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
