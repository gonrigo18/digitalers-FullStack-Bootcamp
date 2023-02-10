package evaluacionPractica2;

public class Dimension {
	private Double alto;
	private Double ancho;
	private Double profundidad;

	public Dimension() {
	}

	public Dimension(Double alto, Double ancho, Double profundidad) {
		this.alto = alto;
		this.ancho = ancho;
		this.profundidad = profundidad;
	}

	public Double getAlto() {
		return alto;
	}

	public void setAlto(Double alto) {
		this.alto = alto;
	}

	public Double getAncho() {
		return ancho;
	}

	public void setAncho(Double ancho) {
		this.ancho = ancho;
	}

	public Double getProfundidad() {
		return profundidad;
	}

	public void setProfundidad(Double profundidad) {
		this.profundidad = profundidad;
	}

	public Double getVolumen(Double alto, Double ancho, Double profundidad) {
		return alto * ancho * profundidad;
	}

	@Override
	public String toString() {
		return "Dimension [alto=" + alto + ", ancho=" + ancho + ", profundidad=" + profundidad + "]";
	}

}
