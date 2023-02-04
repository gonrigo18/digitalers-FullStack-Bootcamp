package com.digitalers.clase3.herencia;

import com.digitalers.clase1.buscador.Article;

public class Book extends Article {

	private String isbn;
	private String pages;

	public Book(String title, String autor, Float price, String isbn, String pages) {
		super(title, autor, price);
		this.isbn = isbn;
		this.pages = pages;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getPages() {
		return pages;
	}

	public void setPages(String pages) {
		this.pages = pages;
	}

}
