package ejercicioIntegrador;

public class Plane extends Flying implements Landable {

	private String brand;

	public Plane(String name) {
		super(name);
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getType() {
		return "Plane";
	}

	@Override
	public String toString() {
		return super.toString() + "Plane [brand=" + brand + "]";
	}

	@Override
	public void canLand() {
		System.out.println("Comenzando aterrizaje de " + getName());
		
	}

}
