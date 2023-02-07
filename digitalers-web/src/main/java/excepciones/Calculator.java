package excepciones;

public class Calculator {

	private String operation;
	private Double a;
	private Double b;
	private Double total;

	public Calculator() {
	}

	public Calculator(String operation) {
		this.operation = operation;

	}

	public Calculator(Double a, Double b) {
		this.a = a;
		this.b = b;
	}

	public Calculator(String operation, Double a, Double b) {
		this.operation = operation;
		this.a = a;
		this.b = b;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public Double getA() {
		return a;
	}

	public void setA(Double a) {
		this.a = a;
	}

	public Double getB() {
		return b;
	}

	public void setB(Double b) {
		this.b = b;
	}

	public Double getTotal() {
		return total;
	}

	private void setTotal(Double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Calculator [operation=" + operation + ", a=" + a + ", b=" + b + ", total=" + total + "]";
	}

	public void division() throws DivisionException {
		if (this.b == null || this.b.equals(0d)) {
			throw new DivisionException("No se puede dividir por un valor nulo o 0");
		} else {
			setTotal(this.a / this.b);
			System.out.println("El resultado es: " + this.total);
		}

	}

}
