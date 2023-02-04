package com.digitalers.clase3.herencia;

import com.digitalers.clase1.buscador.Article;

public class Book extends Article {

	private String isbn;
	private Integer pages;

	public Book(String title, String autor, Float price, String isbn, Integer pages) {
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

	public Integer getPages() {
		return pages;
	}

	public void setPages(Integer pages) {
		this.pages = pages;
	}

	public void detail() {
		System.out.println("Book: ");
		super.detail();
		System.out.print(this.isbn);
		System.out.print(" | ");
		System.out.println(this.pages);
		System.out.println("-----------------------------------------");

	}

}
