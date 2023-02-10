
package evaluacionPractica;

public class Principal {
	public static void main(String[] args) {

		/*
		 * Crear un objeto tipo barco, un GPS, un Capitan, un Jefe de flota, •
		 * Investigar sobre como crear arreglos y allí ingresar por lo menos 7 marineros
		 * con sus datos según el constructor y mostrarlos todos.
		 */

		Barco barco = new Barco("Titanic", "Crucero", 500, 2000);
		Gps gps = new Gps("2134", "1233", "08/02/2023", "20:54", 15);
		Tripulante capitan = new Capitan(142, 32, 12, "Gonzalo", "1121926879", "M", barco, 5);
		Tripulante jefeDeFlota = new JefeDeFlota(121, 43, 15, "Adrian", "1123765444", "M", barco, 33, 21);
		Tripulante marinero1 = new Marinero(41, 32, 0, "Romina", "1141765444", "F", barco, 523);
		Tripulante marinero2 = new Marinero(43, 23, 3, "Gustavo", "1141765514", "M", barco, 412);
		Tripulante marinero3 = new Marinero(54, 31, 2, "Ramon", "1141765444", "M", barco, 3);
		Tripulante marinero4 = new Marinero(2, 31, 4, "Andrea", "1141765444", "F", barco, 12);
		Tripulante marinero5 = new Marinero(52, 43, 5, "Marta", "1141765444", "F", barco, 0);
		Tripulante marinero6 = new Marinero(412, 18, 1, "Julieta", "1167235444", "F", barco, 4);
		Tripulante marinero7 = new Marinero(551, 35, 1, "Julio", "1141765444", "M", barco, 1);

		Tripulante[] listaTripulantes = new Tripulante[] { capitan, jefeDeFlota, marinero1, marinero2, marinero3,
				marinero4, marinero5, marinero6, marinero7 };

		mostrarTodo(listaTripulantes);
		barco.detalle();
		gps.mostrarDatos();

	}

	private static void mostrarTodo(Tripulante[] listaTripulantes) {
		for (Tripulante tripulante : listaTripulantes) {
			tripulante.mostrarDatos();
			tripulante.sueldo();
			tripulante.bono();
			tripulante.sueldoTotal();
			System.out.println("");
			System.out.println("--------------------------------------");
			System.out.println("");
		}
	}
}
