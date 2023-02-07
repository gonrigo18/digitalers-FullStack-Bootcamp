package excepcionesParte2;

public class Conection implements AutoCloseable {

	private Boolean open;
	private Integer quantity;
	private static Integer activeConections = 0;

	public Conection() {
	}

	public Conection(Integer quantity) {
		this.open = Boolean.FALSE;
		this.quantity = quantity;
	}

	public Boolean getOpen() {
		return open;
	}

	public void setOpen(Boolean open) {
		this.open = open;
	}

	@Override
	public String toString() {
		return "Conection [open=" + open + "]";
	}

	public void consult() throws OfflineException {
		System.out.println("intentando conectar....");
		if (!this.open) {
			throw new OfflineException("ERROR!!!! Conexion interrumpida");
		} else {
			System.out.println("Conexion establecida");
		}
	}

	public void openConection() throws QuantityConectionsException {
		if (Conection.activeConections < this.quantity) {
			this.open = Boolean.TRUE;
			Conection.activeConections++;
		} else {
			throw new QuantityConectionsException("Ya hay 3 conexiones simultaneas");
		}
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void closeConection() {
		this.open = Boolean.FALSE;
		Conection.activeConections = 0;
		System.out.println("Se cerraron todas las conexiones");
	}

	@Override
	public void close() throws Exception {
		this.closeConection();
	}

}
