package ejercicioIntegrador;

public abstract class Flying {

	protected String name;

	public Flying(String name) {
		this.name = name;
	}

	public abstract String getType();


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Flying [name=" + name + "]";
	}

	public static void show(Flying[] list) {
		for (Flying obj : list)
			System.out.println("Soy un: " + obj.getType() + " -------- " + obj.toString());
	}
	
	

}
