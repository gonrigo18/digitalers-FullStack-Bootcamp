package ejercicioLaboratorio;

public class Document extends Persona {

	private String dniType;
	private long dniNumber;
	
	

	public Document(String dniType, long dniNumber) {
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

	public Long getDniNumber() {
		return dniNumber;
	}

	public void setDniNumber(Long dniNumber) {
		this.dniNumber = dniNumber;
	}

}
