package ejercicioIntegrador;

public class Helicopter extends Flying {

	private String color;

	public Helicopter(String name) {
		super(name);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getType() {
		return "Helicopter";
	}

	@Override
	public String toString() {
		return super.toString() + "Helicopter [color=" + color + "]";
	}

}
