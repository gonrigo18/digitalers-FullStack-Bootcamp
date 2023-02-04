package com.digitalers.clase1.buscador;

public class Article {

	protected String title;
	protected String autor;
	protected Float price;
	protected String image;

	public Article(String title, String autor, Float price) {
		this.title = title;
		this.autor = autor;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public void detail() {
		System.out.print(this.title);
		System.out.print(" | ");
		if (this.autor != null) {
			System.out.print(this.autor);
			System.out.print(" | ");
		}
		System.out.println(this.price);

	}

}
