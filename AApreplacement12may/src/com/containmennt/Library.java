package com.containmennt;

import java.util.Arrays;

public class Library {

	String typeOfBooks;
	String libName;
	Book books[];

	public Library() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Library(String typeOfBooks, String libName, Book[] books) {
		super();
		this.typeOfBooks = typeOfBooks;
		this.libName = libName;
		this.books = books;
	}

	public String getTypeOfBooks() {
		return typeOfBooks;
	}

	public void setTypeOfBooks(String typeOfBooks) {
		this.typeOfBooks = typeOfBooks;
	}

	public String getLibName() {
		return libName;
	}

	public void setLibName(String libName) {
		this.libName = libName;
	}

	public Book[] getBooks() {
		return books;
	}

	public void setBooks(Book[] books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "Library [typeOfBooks=" + typeOfBooks + ", libName=" + libName + ", \nbooks=" + Arrays.toString(books)
				+ "]";
	}

}
