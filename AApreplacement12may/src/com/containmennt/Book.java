package com.containmennt;

public class Book {

	int bookId;
	float price;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(int bookId, float price) {
		super();
		this.bookId = bookId;
		this.price = price;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "\nBook [bookId=" + bookId + ", price=" + price + "]";
	}

}
