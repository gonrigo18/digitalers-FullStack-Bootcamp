package clase5.ejercicios;

public class Persona {
	private String nombre;
	private String apellido;
	private IIDioma idiomaNativo;
	private IIDioma[] otrosIdiomas;

	public Persona(String nombre, String apellido, IIDioma idiomaNativo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.idiomaNativo = idiomaNativo;
		this.otrosIdiomas = new IIDioma[] {};
	}

	public void aprender(IIDioma nuevoIdioma) {
		IIDioma[] idiomasActuales = new IIDioma[this.otrosIdiomas.length + 1];
		System.out.println(this.otrosIdiomas.length);
		for (int i = 0; i < otrosIdiomas.length; i++) {
			idiomasActuales[i] = otrosIdiomas[i];
		}
		idiomasActuales[idiomasActuales.length - 1] = nuevoIdioma;
		this.otrosIdiomas = idiomasActuales;
	}

	public void hablar() {
		idiomaNativo.hablar();

		for (IIDioma idioma : otrosIdiomas) {
			idioma.hablar();
		}
	}
	
	public void decir (String frase, IIDioma idioma) throws NoIdiomaException {
		
		/*if (! ) {
			throws new NoIdiomaException(this.nombre, this.apellido, frase, idioma);
		}*/
		
	}

}
