package evaluacionPractica3;

public class ProgramaPrueba {

	public static void main(String[] args) {
		Electrodomestico e1 = new Electrodomestico("nevera", "elpolo", 0.58);

		e1.setPotencia(0.67);
		e1.setMarca("frigo");

		System.out.println(e1);

		int horas = 10;
		double consum = e1.getConsumo(horas);
		double preciokwh = 0.5;
		double coste = e1.getCostoConsumo(horas, preciokwh);
		System.out.println("Ha consumido: " + consum + " kW en " + horas + " horas");
		System.out.println("Debe pagar: " + coste + " €");

		Lavadora lava1 = new Lavadora("lavinchi", 400, 0.5, false);

		System.out.println(lava1);
		lava1.setAguaCaliente(true);
		System.out.println("Consumo de la lavadora en 10 horas: " + lava1.getConsumo(10));
		System.out.println("Coste del consumo en 10 horas: " + lava1.getCostoConsumo(10, 2));

	}

}
