package com.digitalers.clase1.buscador;

import java.util.Vector;

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
	
	public Article[] findKey (String key, Vector listado) {
		Article[] listado = new Article[] {}; 
		for(int i = 0; i < article.length; i ++) {
			if (key.equals(article.getTitle())) {
				listado = article;
			}
		}
		return article;
	}
	
	

}
