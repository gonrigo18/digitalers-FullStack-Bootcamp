package com.digitalers.clase1.buscador;

import com.digitalers.clase3.herencia.Book;
import com.digitalers.clase3.herencia.Film;
import com.digitalers.clase3.herencia.Music;

public class Browser {

	private String key;
	private Article[] article;
	private Integer quantity;

	public Browser() {
		this.key = "";
		this.article = new Article[] {};
		this.quantity = 0;
	}

	public Browser(String key) {
		this.key = key;
		this.article = new Article[] {};
		this.quantity = 0;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public void find() {
		Article article1 = new Book("TONY STARK IRON MAN 2", "SLOTT,DAN", 910f, "sfff", 5);
		String[] songs = new String[] { "tema-1", "tema-2" };

		Article article2 = new Music("EL INVENCIBLE IRON MAN 2", "SLOTT,DAN", 910f, "sony",
				new String[] { "tema1", "tema2" });
		Article article3 = new Book("titulo", "autor", 1000f, "12345", 100);
		Article article4 = new Music("ac/dc", "ac/dc", 1000f, "warner", new String[] { "tema1", "tema2" });
		Article article5 = new Film("Nemo", "Nemo", 100f, "Warner", "Fantasy");

		Article[] results = new Article[] { article1, article2, article3, article4, article5 };

		this.article = results;
		this.quantity = article.length;

	}

	public Article[] getArticle() {
		return article;
	}

	public void setArticle(Article[] article) {
		this.article = article;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public boolean isResult() {
		return this.quantity > 0;
	}

	/*
	 * public void find() { Article article1 = new Article ("TONY STARK IRON MAN 2",
	 * "SLOTT,DAN", 910f); Article article2 = new Article
	 * ("EL INVENCIBLE IRON MAN 2", "SLOTT,DAN", 910f); Article article3 = new
	 * Article ("IRON MAN 3", null, 910f); Article article4 = new Article ("nada",
	 * null, 910f);
	 * 
	 * 
	 * Article[] results = new Article[4]; if (key.equals(article1.getTitle())) {
	 * results[0] = article1; } if (this.key.equals(article2.getTitle())) {
	 * results[1] = article2; } if (this.key.equals(article3.getTitle())) { results
	 * [2] = article3; } if (this.key.equals(article4.getTitle())) { results [3] =
	 * article4; }
	 * 
	 * this.article = results; this.quantity = article.length;
	 * 
	 * }
	 */

}
