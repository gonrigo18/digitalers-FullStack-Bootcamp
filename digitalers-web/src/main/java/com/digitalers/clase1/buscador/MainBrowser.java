package com.digitalers.clase1.buscador;

public class MainBrowser {

	public static void main(String[] args) {

		String searchKey = "iron man";
		Browser myBrowser = new Browser(searchKey);

		myBrowser.find();

		if (myBrowser.isResult()) {
			System.out.println(
					"Se encontraron " + myBrowser.getQuantity() + " resultados para " + myBrowser.getKey() + ": ");
			System.out.println(" ");
			Article[] results = myBrowser.getArticle();
			for (Article valor : results) {
				valor.detail();
			}
		} else
			System.out.println("No hay resultados");

	}

}
