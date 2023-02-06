package ejercicioIntegrador;

import java.util.Vector;

public class Main {

	public static void main(String[] args) {

		Flying[] flying = FlyingBuilder.flyingBuilder();
		//Flying.show(flying);

		for (Flying obj : flying) {
			System.out.println(obj.getName() + " puede aterrizar");
			if (obj instanceof Landable) {
				Landable land = (Landable) obj;
				land.canLand();
			} else {
				System.out.println(obj.getName() + " no puede aterrizar");
			}
		}

	}

}
