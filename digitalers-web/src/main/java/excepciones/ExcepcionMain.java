package excepciones;

public class ExcepcionMain {

	public static void main(String[] args) {

		String operation = "/";

		double a = 10;
		double b = 0;
		Calculator calcu = new Calculator(a, b);
		try {
			calcu.division();
		} catch (DivisionException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Continuo");

	}

}
