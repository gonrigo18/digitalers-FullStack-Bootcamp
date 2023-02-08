package clase5.ejercicios;

public class Main {

	public static void main(String[] args) {
		Persona persona = new Persona("Gonzalo", "Rigobello", new Espanol());

		persona.aprender(new Ingles());

		persona.aprender(new Portugues());
		persona.hablar();

	}

}
