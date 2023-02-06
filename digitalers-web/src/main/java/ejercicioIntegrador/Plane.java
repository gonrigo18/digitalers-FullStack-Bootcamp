package ejercicioIntegrador;

public class Plane extends Flying {

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

}
