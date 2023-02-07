package excepcionesParte2;

public class Main {

	public static void main(String[] args) throws QuantityConectionsException {

		try (Conection obj2 = new Conection(2)) {
			obj2.openConection();
			obj2.openConection();
			obj2.consult();
		} catch (OfflineException e) {
			e.printStackTrace();
		} catch (QuantityConectionsException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
