package evaluacionPractica;

public class Gps {

	private String coordenadaX;
	private String coordenadaY;
	private String fecha;
	private String hora;
	private Integer diasTripulado;

	public Gps(String coordenadaX, String coordenadaY, String fecha, String hora, Integer diasTripulado) {
		this.coordenadaX = coordenadaX;
		this.coordenadaY = coordenadaY;
		this.fecha = fecha;
		this.hora = hora;
		this.diasTripulado = diasTripulado;
	}

	public String getCoordenadaX() {
		return coordenadaX;
	}

	public void setCoordenadaX(String coordenadaX) {
		this.coordenadaX = coordenadaX;
	}

	public String getCoordenadaY() {
		return coordenadaY;
	}

	public void setCoordenadaY(String coordenadaY) {
		this.coordenadaY = coordenadaY;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public Integer getDiasTripulado() {
		return diasTripulado;
	}

	public void setDiasTripulado(Integer diasTripulado) {
		this.diasTripulado = diasTripulado;
	}

	@Override
	public String toString() {
		return "Gps [coordenadaX=" + coordenadaX + ", coordenadaY=" + coordenadaY + ", fecha=" + fecha + ", hora="
				+ hora + ", diasTripulado=" + diasTripulado + "]";
	}

}
