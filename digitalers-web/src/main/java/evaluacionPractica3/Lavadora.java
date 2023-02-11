package evaluacionPractica3;

public class Lavadora extends Electrodomestico {

	private double precio;
	private boolean aguaCaliente;

	public Lavadora(String marca, double potencia) {
		super("Lavadora", marca, potencia);
		this.precio = 0;
		this.aguaCaliente = false;
	}

	public Lavadora(String marca, double precio, double potencia, boolean aguaCaliente) {
		super("Lavadora", marca, potencia);
		this.precio = precio;
		this.aguaCaliente = aguaCaliente;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isAguaCaliente() {
		return aguaCaliente;
	}

	public void setAguaCaliente(boolean aguaCaliente) {
		this.aguaCaliente = aguaCaliente;
	}

	@Override
	public String toString() {
		return super.toString() + "Lavadora [precio=" + precio + ", aguaCaliente=" + aguaCaliente + "]";
	}

	@Override
	public double getConsumo(int horas) {
		double consumo = 0;
		if (aguaCaliente) {
			consumo = horas * (potencia + potencia * 0.20);
		} else {
			consumo = horas * potencia;
		}
		return consumo;
	}

	public double getCostoConsumo(int horas, double costeHora) {
		return getConsumo(horas) * costeHora;
	}
}
