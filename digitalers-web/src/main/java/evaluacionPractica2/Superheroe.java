package evaluacionPractica2;

public class Superheroe {
	private String nombre;
	private String descripcion;
	private boolean capa;

	public Superheroe(String nombre) {
		this.nombre = nombre;
		this.descripcion = "";
		this.capa = false;
	}

	public Superheroe(String nombre, boolean capa) {
		this.nombre = nombre;
		this.descripcion = "";
		this.capa = capa;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public boolean getCapa() {
		return capa;
	}

	public void setCapa(boolean capa) {
		this.capa = capa;
	}

	public Boolean isCapa() {
		return capa;
	}

	@Override
	public String toString() {
		return "Superheroe [nombre=" + nombre + ", descripcion=" + descripcion + ", capa=" + capa + "]";
	}

}
