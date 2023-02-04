package com.digitalers.clase3.herencia;

import com.digitalers.clase1.buscador.Article;

public class BrowserHerenciaMain {
	public static void main(String[] args) {

		Article article1 = new Book("titulo", "autor", 1000f, "12345", 100);
		Book book1 = (Book) article1;
		Article article2 = new Music("ac/dc", "ac/dc", 1000f, "warner", new String[] {});
		Music music1 = (Music) article2;

		Article[] all = new Article[] { article1, book1, article2, music1 };
		
		for (Article valor : all) {
			valor.detail();
		}

	}

}
