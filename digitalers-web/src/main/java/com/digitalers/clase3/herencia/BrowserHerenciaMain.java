package com.digitalers.clase3.herencia;

import com.digitalers.clase1.buscador.Article;

public class BrowserHerenciaMain {
	public static void main(String[] args) {

		Article article1 = new Book("titulo", "autor", 1000f, "12345", 100);
		Book book1 = (Book) article1;
		Article article2 = new Music("ac/dc", "ac/dc", 1000f, "warner", new String[] { "tema1", "tema2" });
		Music music1 = (Music) article2;
		Article article3 = new Film("Nemo", "Nemo", 100f, "Warner", "Fantasy");
		Article[] all = new Article[] { article1, book1, article2, music1, article3 };

		for (Article valor : all) {
			valor.detail();
		}

	}

}
