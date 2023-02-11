package evaluacionPractica3;

public class Electrodomestico {
	protected String tipo;
	protected String marca;
	protected double potencia;

	public Electrodomestico(String tipo, String marca, double potencia) {
		this.tipo = tipo;
		this.marca = marca;
		this.potencia = potencia;
	}

	public Electrodomestico(String marca2, double potencia2) {
		this.marca = marca2;
		this.potencia = potencia2;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	@Override
	public String toString() {
		return "Electrodomestico [tipo=" + tipo + ", marca=" + marca + ", potencia=" + potencia + "]";
	}

	public double getConsumo(int horas) {
		return potencia * horas;
	}

	public double getCostoConsumo(int horas, double costeHora) {
		return getConsumo(horas) * costeHora;
	}

}
