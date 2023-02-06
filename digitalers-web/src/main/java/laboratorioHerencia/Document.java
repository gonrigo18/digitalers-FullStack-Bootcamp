package laboratorioHerencia;

public class Document {

	private String dniType;
	private String dniNumber;


	public Document(String dniType, String dniNumber) {
		super();
		this.dniType = dniType;
		this.dniNumber = dniNumber;
	}

	public String getDniType() {
		return dniType;
	}

	public void setDniType(String dniType) {
		this.dniType = dniType;
	}

	public String getDniNumber() {
		return dniNumber;
	}

	public void setDniNumber(String dniNumber) {
		this.dniNumber = dniNumber;
	}

	@Override
	public String toString() {
		return "Document [dniType=" + dniType + ", dniNumber=" + dniNumber + "]";
	}
	
	

}
