package excepciones;

public class DivisionException extends Exception {
	
	private static final long serialVersionUID =743952248194926381L;

	public DivisionException(String message) {
		super(message);
	}
	
	public void division() {
		System.out.println("No se puede dividir por null o 0");
	}
	
	
	

}
