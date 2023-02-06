package ejercicioIntegrador;

public class Superman extends Flying implements Landable {

	private Boolean wearCape;

	public Superman(String name) {
		super(name);
	}

	public Boolean getWearCape() {
		return wearCape;
	}

	public void setWearCape(Boolean wearCape) {
		this.wearCape = wearCape;
	}
	
	public String getType() {
		return "Superman";
	}

	@Override
	public String toString() {
		return super.toString() + "Superman [wearCape=" + wearCape + "]";
	}

	@Override
	public void canLand() {
		System.out.println("Comenzando aterrizaje de " + getName());
		
	}

}
