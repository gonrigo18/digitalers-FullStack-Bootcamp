package evaluacionPractica;

public class Marinero extends Tripulante {
	private Integer pesoTotalPescado;
	private final Float sueldo = 90000f;
	private Float sueldoTotal;
	private Float bono;

	public Marinero(Integer numeroCarnet, Integer edad, Integer tiempoEnLaEmpresa, String nombre, String telefono,
			String sexo, Barco barco, Integer pesoTotalPescado) {
		super(numeroCarnet, edad, tiempoEnLaEmpresa, nombre, telefono, sexo, barco);
		this.pesoTotalPescado = pesoTotalPescado;
	}

	public Integer getPesoTotalPescado() {
		return pesoTotalPescado;
	}

	public void setPesoTotalPescado(Integer pesoTotalPescado) {
		this.pesoTotalPescado = pesoTotalPescado;
	}

	public Float getSueldoTotal() {
		return sueldoTotal;
	}

	public void setSueldoTotal(Float sueldoTotal) {
		this.sueldoTotal = sueldoTotal;
	}

	public Float getBono() {
		return bono;
	}

	public void setBono(Float bono) {
		this.bono = bono;
	}

	public Float getSueldo() {
		return sueldo;
	}

	public void sueldo() {
		System.out.println("Sueldo: " + this.sueldo);
	}

	public void calcularBono() {
		if (this.pesoTotalPescado >= 1) {
			setBono(this.pesoTotalPescado * 0.25f);
		} else {
			setBono(0f);
			System.out.println("Bono: " + getBono() + " porque no pesco nada");
		}
	}

	public void sueldoTotal() {
		setBono(this.pesoTotalPescado * 0.25f);
		setSueldoTotal(this.sueldo + getBono());
		System.out.println("Sueldo total: " + getSueldoTotal());
	}

	@Override
	public String toString() {
		return super.toString() + "Marinero [pesoTotalPescado=" + pesoTotalPescado + ", sueldo=" + sueldo
				+ ", sueldoTotal=" + sueldoTotal + ", bono=" + bono + "]";
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

	@Override
	public void bono() {
		calcularBono();
		if (getBono() != null && getBono() != 0) {
			System.out.println("Monto del bono: " + getBono());
		}
	}

}
