package evaluacionPractica;

public class Barco {

	private String nombre;
	private String tipo;
	private Integer capacidadDeCarga;
	private Integer capacidadDePasajeros;

	public Barco(String nombre, String tipo, Integer capacidadDeCarga, Integer capacidadDePasajeros) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.capacidadDeCarga = capacidadDeCarga;
		this.capacidadDePasajeros = capacidadDePasajeros;
	}

	public void mostrarDatos() {
		System.out.println(this.nombre);
		System.out.println(this.tipo);
		System.out.println(this.capacidadDeCarga);
		System.out.println(this.capacidadDePasajeros);

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Integer getCapacidadDeCarga() {
		return capacidadDeCarga;
	}

	public void setCapacidadDeCarga(Integer capacidadDeCarga) {
		this.capacidadDeCarga = capacidadDeCarga;
	}

	public Integer getCapacidadDePasajeros() {
		return capacidadDePasajeros;
	}

	public void setCapacidadDePasajeros(Integer capacidadDePasajeros) {
		this.capacidadDePasajeros = capacidadDePasajeros;
	}

	public void detalle() {
		System.out.println("Nombre: " + getNombre());
		System.out.println("Tipo: " + getTipo());
		System.out.println("Capacidad de carga: " + getCapacidadDeCarga());
		System.out.println("Capacidad de pasajeros: " + getCapacidadDePasajeros());
	}

	@Override
	public String toString() {
		return "Barco [nombre=" + nombre + ", tipo=" + tipo + ", capacidadDeCarga=" + capacidadDeCarga
				+ ", capacidadDePasajeros=" + capacidadDePasajeros + "]";
	}

}
