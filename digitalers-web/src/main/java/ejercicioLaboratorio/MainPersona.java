package ejercicioLaboratorio;

import java.util.Scanner;

public class MainPersona {

	public static void main(String[] args) {
		
		Persona persona1 = new Persona();

		System.out.println("Ingrese su nombre: ");
		Scanner keyboard = new Scanner(System.in);
		persona1.setName(keyboard.next());
		
		System.out.println("Ingrese su apellido: ");
		persona1.setLastName(keyboard.next());
		
		
		System.out.println("Ingrese su tipo y numero de DNI: ");		
		Persona document1 = new Document(keyboard.next(), keyboard.nextLong());
		persona1.setDocument(document1);
		
		persona1.show();
		
		keyboard.close();
	
	}
	

}
