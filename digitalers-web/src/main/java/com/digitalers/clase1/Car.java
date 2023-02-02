package com.digitalers.clase1;

public class Car {
	
	String brand;
	String color;
	String model;
	Integer chasis;
	Float maxVelocity;
	Float currentSpeed;
	Boolean newModel;
	Boolean started;
	
	Car(){
		this.started=false;
		this.color = "grey";
		this.maxVelocity = 150f;
		this.currentSpeed = 0f;
		System.out.println("Creando auto");
	}
	
	public Car(String brand, String model, Float maxVelocity) {
		this.currentSpeed = 0f;
		this.started = false;
		this.brand = brand;
		this.model = model;
		this.maxVelocity = maxVelocity;
	}
	
	void turnOn () {
		if (!this.started) {
		this.started = true;
		System.out.println(this.brand + " " + this.model + " se ha encendido");
		}else {
			System.out.println(this.brand + " " + this.model + " ya se encuentra encendido");
		}
		
	}
	void turnOff() {
		if (this.started) {
			this.started = false;
			System.out.println(this.brand + " " + this.model + " se ha apagado");
			}else {
				System.out.println(this.brand + " " + this.model + " ya se encuentra apagado");
			}
		
	}
	
	void breakCar() {
		
	}
	
	void speedUp() {
		if (this.started) {
			if (this.currentSpeed < this.maxVelocity) {
				this.currentSpeed = this.currentSpeed +1f;
				System.out.println("El " + this.brand + " " + this.model + " va a " + this.currentSpeed + " km/h");
			}
		}else {
			System.out.println("El auto esta apagado, por favor encenderlo");
		}
	}

	
	
	
	
}
