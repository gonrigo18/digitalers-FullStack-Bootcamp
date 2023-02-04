package com.digitalers.clase3.herencia;

import com.digitalers.clase1.buscador.Article;

public class Film extends Article {

	private String producer;
	private String format;

	public Film(String title, String autor, Float price, String producer, String format) {
		super(title, autor, price);
		this.producer = producer;
		this.format = format;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public void detail() {
		System.out.println("Film: ");
		super.detail();
		System.out.print(this.producer);
		System.out.print(" | ");
		System.out.println(this.format);
		System.out.println("-----------------------------------------");
	}

}
