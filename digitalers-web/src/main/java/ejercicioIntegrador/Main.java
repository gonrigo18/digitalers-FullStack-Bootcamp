package ejercicioIntegrador;

import java.util.Vector;

public class Main {

	public static void main(String[] args) {

		Flying[] flying = FlyingBuilder.flyingBuilder();
		Flying.show(flying);

	}

}
