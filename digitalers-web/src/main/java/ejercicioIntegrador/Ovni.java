package ejercicioIntegrador;

public class Ovni extends Flying {

	private String shape;

	public Ovni(String name) {
		super(name);
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public String getType() {
		return "Ovni";
	}

	@Override
	public String toString() {
		return super.toString() + "Ovni [shape=" + shape + "]";
	}

}
