package ejercicioIntegrador;

public class FlyingBuilder {

	public static Flying[] flyingBuilder() {

		Flying obj1 = new Plane("Boeing");
		Flying obj2 = new Helicopter("Halcon negro");
		Flying obj3 = new Superman("Clark Kent");
		Flying obj4 = new Ovni("Reptilianos");
		Flying obj5 = new Ovni("Anunakis");
		Flying obj6 = new Ovni("Et");
		Flying[] list = new Flying[] { obj1, obj2, obj3, obj4, obj5, obj6 };

		return list;
	}

}
