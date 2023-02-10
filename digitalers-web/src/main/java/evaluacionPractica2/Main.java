package evaluacionPractica2;

public class Main {
	public static void main(String[] args) {
		Figura figura1 = new Figura("LALA1", 147.1, new Superheroe("Spiderman"), new Dimension(9.1, 2.3, 1.0));
		Figura figura2 = new Figura("GAD3", 157.3, new Superheroe("Superman", true), new Dimension(9.1, 2.3, 1.0));

		Coleccion marvel = new Coleccion("Marvel");
		marvel.anadirFigura(figura1);
		marvel.anadirFigura(figura2);
		// marvel.subirPrecio(2.0, "LALA1");
		// marvel.subirPrecio(10.1, "GAD3");


		System.out.println(marvel.conCapa());
		System.out.println("Figura mas valiosa: " + marvel.masValioso());
		System.out.println("El valor total de la coleccion es: " + marvel.getValorColeccion());
		System.out.println("El volumen total es de: " + marvel.getVolumenColeccion());
	}
}
