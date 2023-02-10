package evaluacionPractica;

public class JefeDeFlota extends Tripulante implements Metodos {
	private Integer pesoPescado;
	private Integer pesoMarisco;
	private final Float sueldo = 350000000f;
	private Float sueldoTotal;
	private Float bonoPescado;
	private Float bonoMarisco;

	public JefeDeFlota(Integer numeroCarnet, Integer edad, Integer tiempoEnLaEmpresa, String nombre, String telefono,
			String sexo, Barco barco, Integer pesoPescado, Integer pesoMarisco) {
		super(numeroCarnet, edad, tiempoEnLaEmpresa, nombre, telefono, sexo, barco);
		this.pesoMarisco = pesoMarisco;
		this.pesoPescado = pesoPescado;
	}

	public Integer getPesoPescado() {
		return pesoPescado;
	}

	public void setPesoPescado(Integer pesoPescado) {
		this.pesoPescado = pesoPescado;
	}

	public Integer getPesoMarisco() {
		return pesoMarisco;
	}

	public void setPesoMarisco(Integer pesoMarisco) {
		this.pesoMarisco = pesoMarisco;
	}

	public Float getSueldoTotal() {
		return sueldoTotal;
	}

	public void setSueldoTotal(Float sueldoTotal) {
		this.sueldoTotal = sueldoTotal;
	}

	public Float getBonoPescado() {
		return bonoPescado;
	}

	public void setBonoPescado(Float bonoPescado) {
		this.bonoPescado = bonoPescado;
	}

	public Float getBonoMarisco() {
		return bonoMarisco;
	}

	public void setBonoMarisco(Float bonoMarisco) {
		this.bonoMarisco = bonoMarisco;
	}

	public Float getSueldo() {
		return sueldo;
	}

	public void calcularBonos() {
		setBonoPescado(this.pesoPescado * 1f);
		setBonoMarisco(this.pesoMarisco * 2f);
	}

	public void sueldoTotal() {
		calcularBonos();
		setSueldoTotal(getSueldo() + getBonoMarisco() + getBonoPescado());
		System.out.println("Sueldo total: " + getSueldoTotal());
	}

	public void sueldo() {
		System.out.println("Sueldo base: " + getSueldo());
	}

	public void bono() {
		calcularBonos();
		System.out.println("Bono por pescado: " + getBonoPescado());
		System.out.println("Bono por marisco: " + getBonoMarisco());
	}

	@Override
	public String toString() {
		return super.toString() + "JefeDeFlota [pesoPescado=" + pesoPescado + ", pesoMarisco=" + pesoMarisco
				+ ", sueldo=" + sueldo + ", sueldoTotal=" + sueldoTotal + ", bonoPescado=" + bonoPescado
				+ ", bonoMarisco=" + bonoMarisco + "]";
	}

	@Override
	public void mostrarDatos() {
		System.out.println("Numero de carnet: " + getNumeroCarnet());
		System.out.println("Nombre: " + getNombre());
		System.out.println("Sexo: " + getSexo());
		System.out.println("Edad: " + getEdad());
		System.out.println("Telefono: " + getTelefono());
		System.out.println("Tiempo en la empresa: " + getTiempoEnLaEmpresa() + " anos");

	}

}
