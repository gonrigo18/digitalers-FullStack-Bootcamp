package ejercicioIntegrador;

import java.util.Vector;

public class Main {

	public static void main(String[] args) {

		Flying[] flying = FlyingBuilder.flyingBuilder();
		//Flying.show(flying);

		for (Flying obj : flying) {
			if (obj instanceof Landable) {
				System.out.println(obj.getName() + " puede aterrizar");
				Landable land = (Landable) obj;
				land.canLand();
			} else {
				System.out.println(obj.getName() + " no puede aterrizar");
			}
		}

	}

}
