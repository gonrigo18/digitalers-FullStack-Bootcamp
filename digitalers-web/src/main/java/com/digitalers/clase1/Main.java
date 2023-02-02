package com.digitalers.clase1;

public class Main {

	public static void main(String[] args) {
		
		Car fox = new Car("Clio", "Renault", 150f);
		fox.turnOn();
		fox.speedUp();
		fox.breakCar();
		fox.speedUp();
		fox.breakCar();
		fox.speedUp();
		fox.breakCar();
		fox.breakCar();
		fox.turnOff();
		
		
		Car up = new Car("Vw", "Up", 150f);
		up.turnOn();
		
		while (up.canSpeedUp()) {
			up.speedUp();
		}
		System.out.println("Velocidad: " + up.getCurrentSpeed());

	}

}
