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
	
	public void find() {
		Article article1 = new Article ("TONY STARK IRON MAN 2", "SLOTT,DAN", 910f);
		Article article2 = new Article ("EL INVENCIBLE IRON MAN 2", "SLOTT,DAN", 910f);
		
		Article[] results = new Article[2];
		results[0] = article1;
		results[1] = article2;
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
	
	

}
