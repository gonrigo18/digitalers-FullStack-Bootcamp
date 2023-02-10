package evaluacionPractica2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Coleccion {
	private String nombreColeccion;
	private ArrayList<Figura> listaFiguras;

	public Coleccion(String nombreColeccion) {
		this.nombreColeccion = nombreColeccion;
		listaFiguras = new ArrayList<Figura>();
	}

	public String getNombreColeccion() {
		return nombreColeccion;
	}

	public void setNombreColeccion(String nombreColeccion) {
		this.nombreColeccion = nombreColeccion;
	}

	public void anadirFigura(Figura fig) {
		listaFiguras.add(fig);
	}

	public void subirPrecio(double cantidad, String id) {
		for (Figura figuraActual : listaFiguras) {
			if (Objects.equals(figuraActual.getCodigo(), id)) {
				figuraActual.setPrecio(figuraActual.getPrecio() + cantidad);
			}
		}

	}

	public String conCapa() {
		String cadena = "Figuras con capa:\n ";
		for (Figura fig : listaFiguras) {
			if (fig.getSuperheroe().isCapa()) {
				cadena += fig + "\n";
			}
		}
		return cadena;
	}

	public Figura masValioso() {
		Figura figuraMasValiosa = new Figura() {
		};
		for (Figura figuraActual : listaFiguras) {
			if (figuraActual.getPrecio() > figuraMasValiosa.getPrecio()) {
				figuraMasValiosa = figuraActual;
			}
		}
		return figuraMasValiosa;
	}

	public double getValorColeccion() {
		double valorTotal = 0.0;
		for (Figura figuraActual : listaFiguras) {
			valorTotal = valorTotal + figuraActual.getPrecio();
		}
		return valorTotal;

	}

	public Double getVolumenColeccion() {
		Double volumenTotal = 0.0;
		for (Figura figuraActual : listaFiguras) {
			volumenTotal = volumenTotal + figuraActual.getDimensiones().getVolumen();
		}
		return (volumenTotal + 200);

	}

	@Override
	public String toString() {
		return "Coleccion [nombreColeccion=" + nombreColeccion + ", listaFiguras=" + listaFiguras + "]";
	}

}
