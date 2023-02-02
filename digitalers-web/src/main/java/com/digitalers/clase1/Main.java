package com.digitalers.clase1;

public class Main {

	public static void main(String[] args) {
		
		Car fox = new Car("Clio", "Renault", 150f);
		fox.turnOn();
		fox.speedUp();
		fox.speedUp();
		fox.speedUp();
		fox.turnOff();
		
		
		Car up = new Car("Vw", "Up", 130f);
		up.turnOn();
		up.turnOff();
		up.speedUp();
		

	}

}
