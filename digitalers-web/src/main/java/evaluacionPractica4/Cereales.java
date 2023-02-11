package evaluacionPractica4;

import java.time.LocalDate;

public class Cereales implements EsAlimento{
	private String marca;
	private double precio;
	private String tipoCereal;
	private LocalDate caducidad;

	public Cereales(String marca, String tipoCereal, double precio) {
		this.marca = marca;
		this.precio = precio;
		this.tipoCereal = tipoCereal;
	}

	public String getMarca() {
		return marca;
	}
	
	@Override
    public int getCalorias() {
        if(tipoCereal.equalsIgnoreCase("espelta")) {
            return 5;
        } else if(tipoCereal.equalsIgnoreCase("maíz")) {
            return 8;
        } else if(tipoCereal.equalsIgnoreCase("trigo")) {
            return 12;
        } else {
            return 15;
        }
    }

	@Override
	public String toString() {
		return "Cereales [marca=" + marca + ", precio=" + precio + ", tipoDeCereal=" + tipoCereal + "]";
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getTipoCereal() {
		return tipoCereal;
	}

	public void setTipoCereal(String tipoCereal) {
		this.tipoCereal = tipoCereal;
	}

	@Override
	public void setCaducidad(LocalDate fc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public LocalDate getCaducidad() {
		// TODO Auto-generated method stub
		return null;
	}

}
