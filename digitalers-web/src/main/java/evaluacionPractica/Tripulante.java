package evaluacionPractica;

public abstract class Tripulante implements Metodos {

	protected Integer numeroCarnet;
	protected Integer edad;
	protected Integer tiempoEnLaEmpresa;
	protected String nombre;
	protected String telefono;
	protected String sexo;
	protected Barco barco;

	public Tripulante(Integer numeroCarnet, Integer edad, Integer tiempoEnLaEmpresa, String nombre, String telefono,
			String sexo, Barco barco) {
		this.numeroCarnet = numeroCarnet;
		this.edad = edad;
		this.tiempoEnLaEmpresa = tiempoEnLaEmpresa;
		this.nombre = nombre;
		this.telefono = telefono;
		this.sexo = sexo;
		this.barco = barco;
	}

	public Integer getNumeroCarnet() {
		return numeroCarnet;
	}

	public void setNumeroCarnet(Integer numeroCarnet) {
		this.numeroCarnet = numeroCarnet;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Integer getTiempoEnLaEmpresa() {
		return tiempoEnLaEmpresa;
	}

	public void setTiempoEnLaEmpresa(Integer tiempoEnLaEmpresa) {
		this.tiempoEnLaEmpresa = tiempoEnLaEmpresa;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Barco getBarco() {
		return barco;
	}

	public void setBarco(Barco barco) {
		this.barco = barco;
	}

	public abstract void mostrarDatos();

	public abstract void sueldo();

	@Override
	public String toString() {
		return "Tripulante [numeroCarnet=" + numeroCarnet + ", edad=" + edad + ", tiempoEnLaEmpresa="
				+ tiempoEnLaEmpresa + ", nombre=" + nombre + ", telefono=" + telefono + ", sexo=" + sexo + ", barco="
				+ barco + "]";
	}

}
