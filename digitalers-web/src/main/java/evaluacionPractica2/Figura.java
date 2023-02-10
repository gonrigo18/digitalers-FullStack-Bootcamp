package evaluacionPractica2;

public class Figura {
	private String codigo;
	private Double precio;
	private Superheroe superheroe;
	private Dimension dimensiones;
	
	

	public Figura() {
	}

	public Figura(String codigo, Double precio, Superheroe superheroe, Dimension dimensiones) {
		this.codigo = codigo;
		this.precio = precio;
		this.superheroe = superheroe;
		this.dimensiones = dimensiones;
	}

	@Override
	public String toString() {
		return "Figura [codigo=" + codigo + ", precio=" + precio + ", superheroe=" + superheroe + ", dimensiones="
				+ dimensiones + "]";
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Superheroe getSuperheroe() {
		return superheroe;
	}

	public void setSuperheroe(Superheroe superheroe) {
		this.superheroe = superheroe;
	}

	public Dimension getDimensiones() {
		return dimensiones;
	}

	public void setDimensiones(Dimension dimensiones) {
		this.dimensiones = dimensiones;
	}

	public void subirPrecio(Double cantidad) {
		setPrecio(getPrecio()+cantidad);
	}

}
