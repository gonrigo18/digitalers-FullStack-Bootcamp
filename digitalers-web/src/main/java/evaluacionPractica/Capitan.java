package evaluacionPractica;

public class Capitan extends Tripulante implements Metodos {

	private Integer horasDeExperticia;
	private final Float sueldo = 4500000f;
	private Float sueldoTotal;
	private Float bono;

	public Capitan(Integer numeroCarnet, Integer edad, Integer tiempoEnLaEmpresa, String nombre, String telefono,
			String sexo, Barco barco, Integer horasDeExperticia) {
		super(numeroCarnet, edad, tiempoEnLaEmpresa, nombre, telefono, sexo, barco);
		this.horasDeExperticia = horasDeExperticia;
	}

	public Integer getHorasDeExperticia() {
		return horasDeExperticia;
	}

	public void setHorasDeExperticia(Integer horasDeExperticia) {
		this.horasDeExperticia = horasDeExperticia;
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
		if (this.horasDeExperticia >= 5000 && this.horasDeExperticia < 150000) {
			setBono(this.sueldo * 0.20f);
		} else if (this.horasDeExperticia >= 150000 && this.horasDeExperticia < 300000) {
			setBono(this.sueldo * 0.40f);
		} else {
			setBono(this.sueldo * 0.75f);
		}
	}

	public void sueldoTotal() {
		this.sueldoTotal = this.sueldo + this.bono;
		System.out.println("Sueldo total: " + this.sueldoTotal);
	}

	@Override
	public String toString() {
		return super.toString() + "Capitan [horasDeExperticia=" + horasDeExperticia + ", sueldo=" + sueldo
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
		if (this.horasDeExperticia > 5000) {
			calcularBono();
			System.out.println("Bono: " + getBono());
		} else {
			setBono(0f);
			System.out.println("Horas insuficientes para el bono");
		}

	}

}
