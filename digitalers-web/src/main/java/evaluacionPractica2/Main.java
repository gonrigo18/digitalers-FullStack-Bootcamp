package evaluacionPractica2;

public class Main {
	public static void main(String[] args) {
		Figura figura1 = new Figura("LALA1", 147.2, new Superheroe("Spiderman"), new Dimension(9.1, 2.3, 1.0));
		Figura figura2 = new Figura("GAD3", 147.2, new Superheroe("Superman",true), new Dimension(9.1, 2.3, 1.0));

		Coleccion marvel = new Coleccion("Marvel");
		marvel.anadirFigura(figura1);
		marvel.anadirFigura(figura2);
		
		
	}
}
