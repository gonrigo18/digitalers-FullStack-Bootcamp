package com.digitalers.clase1.buscador;

import java.util.Vector;

public class MainBrowser {

	public static void main(String[] args) {
		
		Browser myBrowser = new Browser();
		String searchKey = "iron man";
		
		myBrowser.find();
		Article[] results = myBrowser.getArticle();	
		
		for (Article valor : results) {
			System.out.println("Titulo: " + valor.getTitle()+ " | " + "Autor: " + valor.getAutor()+ " | " + "Precio: " + valor.getPrice());
		}
		 

	}

}
