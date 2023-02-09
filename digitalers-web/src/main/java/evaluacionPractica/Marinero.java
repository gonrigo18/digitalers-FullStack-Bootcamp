package evaluacionPractica;

public class Marinero extends Tripulante{
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
	public void bono() {
		if (this.pesoTotalPescado >= 1) {
			this.bono = this.pesoTotalPescado * 0.25f;
			System.out.println("Bono: " + this.bono);	
		}else {
		System.out.println("No pesco nada");
		}
	}
	public void sueldoTotal() {
		this.bono = this.pesoTotalPescado * 0.25f;
		this.sueldoTotal = this.sueldo + this.bono;
		System.out.println("Sueldo total: " + this.sueldoTotal);
	}

	@Override
	public String toString() {
		return super.toString() + "Marinero [pesoTotalPescado=" + pesoTotalPescado + ", sueldo=" + sueldo + ", sueldoTotal=" + sueldoTotal
				+ ", bono=" + bono + "]";
	}

}
