package com.digitalers.clase1.buscador;

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
	
	

}
