package com.diigitalers.clase6.generic;

public class GenericMain {

	public static void main(String[] args) {
		
		ArticulosDao articulosDao = new ArticulosDao ();
		Articulos[] articulos = articulosDao.findAll();
		
		SociosDao sociosDao = new SociosDao ();
		Socios[] socios = sociosDao.findAll();

	}

}
