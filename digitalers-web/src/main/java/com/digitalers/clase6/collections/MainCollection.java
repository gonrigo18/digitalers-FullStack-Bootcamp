package com.digitalers.clase6.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MainCollection {
	public static void main(String[] args) {

		// interface i = new clase();
		Set<String> nombres = new HashSet<String>();

		// Agregar elemento
		nombres.add("Carla");
		nombres.add("Juan");
		nombres.add("Carla");

		// mostrar los valores de la lista
		for (String nombre : nombres) {
			System.out.println(nombre);
		}

		// eliminar valores de la lista

		Iterator<String> itNombre = nombres.iterator();
		while (itNombre.hasNext()) {
			String nombre = itNombre.next();
			itNombre.remove();
		}

	}
}
