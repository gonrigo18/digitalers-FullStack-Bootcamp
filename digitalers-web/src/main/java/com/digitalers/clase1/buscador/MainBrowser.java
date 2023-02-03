package com.digitalers.clase1.buscador;

import java.util.Vector;

public class MainBrowser {

	public static void main(String[] args) {
		
		Browser myBrowser = new Browser();
		String searchKey = "iron man";
		myBrowser.setKey(searchKey);
		
		myBrowser.find();
		 

	}

}
