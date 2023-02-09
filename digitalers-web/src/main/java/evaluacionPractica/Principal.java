
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
		Tripulante capitan = new Capitan(142, 32, 12, "Gonzalo", "1121926879", "m", barco, 150001);
		Tripulante jefeDeFlota = new JefeDeFlota(121, 43, 15, "Adrian", "1123765444", "m", barco, 33, 21);
		Tripulante marinero1 = new Marinero(41, 32, 0, "Romina", "1141765444", "s", barco, 523);
		Tripulante marinero2 = new Marinero(43, 23, 3, "Gustavo", "1141765514", "m", barco, 412);
		Tripulante marinero3 = new Marinero(54, 31, 2, "Ramon", "1141765444", "m", barco, 3);
		Tripulante marinero4 = new Marinero(2, 31, 4, "Andrea", "1141765444", "s", barco, 12);
		Tripulante marinero5 = new Marinero(52, 43, 5, "Marta", "1141765444", "s", barco, 0);
		Tripulante marinero6 = new Marinero(412, 18, 1, "Julieta", "1167235444", "s", barco, 4);
		Tripulante marinero7 = new Marinero(551, 35, 1, "Julio", "1141765444", "m", barco, 1);

		Tripulante[] listaTripulantes = new Tripulante[] { capitan, jefeDeFlota, marinero1, marinero2, marinero3,
				marinero4, marinero5, marinero6, marinero7 };
		
		for (Tripulante tripulante : listaTripulantes) {
			System.out.println("Numero de carnet: " +tripulante.getNumeroCarnet());
			System.out.println("Nombre: " + tripulante.getNombre());
			System.out.println("Sexo: " + tripulante.getSexo());
			System.out.println("Edad: " + tripulante.getEdad());
			System.out.println("Telefono: " + tripulante.getTelefono());
			System.out.println("Tiempo en la empresa: " + tripulante.getTiempoEnLaEmpresa() + " anos");
			tripulante.sueldo();
			tripulante.bono();
			tripulante.sueldoTotal();
			System.out.println("");
			System.out.println("--------------------------------------");
			System.out.println("");
		}

	}
}
