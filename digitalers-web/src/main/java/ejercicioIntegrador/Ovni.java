package ejercicioIntegrador;

public class Ovni extends Flying implements Landable {

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

	@Override
	public void canLand() {
		System.out.println("Comenzando aterrizaje de " + getName());

	}
	

}
