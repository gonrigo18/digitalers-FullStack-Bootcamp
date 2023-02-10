package evaluacionPractica2;

import java.util.Arrays;

public class Coleccion{
	private String nombreColeccion;
	private Figura[] listaFiguras;

	public Coleccion(String nombreColeccion) {
		this.nombreColeccion = nombreColeccion;
		Figura[] listaFiguras = new Figura[] {};
	}

	public String getNombreColeccion() {
		return nombreColeccion;
	}

	public void setNombreColeccion(String nombreColeccion) {
		this.nombreColeccion = nombreColeccion;
	}

	public void anadirFigura(Figura fig) {
		this.listaFiguras[listaFiguras.length] = fig;
	}

	public void subirPrecio(Double cantidad, String id) {
		for (Figura figura : listaFiguras) {
			if (figura.getCodigo() == id) {
				figura.setPrecio(figura.getPrecio() + cantidad);
			}else {
				System.out.println("No se encuentra la figura dentro de la colleccion");
			}
		}
	}
	
	public Figura[] conCapa(Figura[] lista) {
		Figura[] conCapa = new Figura[] {};
		for (Figura fig : lista) {
			if (fig.getSuperheroe().getCapa().equals(true)) {
				anadirFigura(fig);
			}
		}
		return conCapa;
	}
	
	public Figura masValioso(Figura[] lista) {
		Figura figuraMasValiosa = new Figura();
		for (int i = 0; i < lista.length; i++) {
			if (lista[i].getPrecio() > figuraMasValiosa.getPrecio()) {
				figuraMasValiosa = lista[i];
			}
		}
		return figuraMasValiosa;
		
	}

	@Override
	public String toString() {
		return "Coleccion [nombreColeccion=" + nombreColeccion + ", listaFiguras=" + Arrays.toString(listaFiguras)
				+ "]";
	}
	
	
	

}
