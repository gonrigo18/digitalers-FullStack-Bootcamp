package com.digitalers.clase3.herencia;

import com.digitalers.clase1.buscador.Article;

public class Music extends Article {

	private String producer;
	private String[] songs;

	public Music(String title, String autor, Float price, String producer, String[] songs) {
		super(title, autor, price);
		this.producer = producer;
		this.songs = songs;

	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public String[] getSongs() {
		return songs;
	}

	public void setSongs(String[] songs) {
		this.songs = songs;
	}

	public void detail() {
		System.out.println("Music: ");
		super.detail();
		System.out.print(this.producer);
		System.out.print(" | ");
		if (this.songs != null) {
			for (String song : this.songs) {
				System.out.print(" " + song + " ");
			}
		}
		System.out.println(" | ");
		System.out.println("-------------------------------------------");

	}

}
