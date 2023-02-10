package evaluacionPractica2;

public class Superheroe {
	private String nombre;
	private String descripcion;
	private Boolean capa;

	public Superheroe(String nombre) {
		this.nombre = nombre;
		this.descripcion = "";
		this.capa = false;
	}
	

	public Superheroe(String nombre, Boolean capa) {
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

	public Boolean getCapa() {
		return capa;
	}

	public void setCapa(Boolean capa) {
		this.capa = capa;
	}

	@Override
	public String toString() {
		return "Superheroe [nombre=" + nombre + ", descripcion=" + descripcion + ", capa=" + capa + "]";
	}

}
