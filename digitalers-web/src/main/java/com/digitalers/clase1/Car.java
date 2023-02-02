package com.digitalers.clase1;

public class Car {
	
	private String brand;
	private String color;
	private String model;
	private Integer chasis;
	private Float maxSpeed;
	private Float currentSpeed;
	private Boolean newModel;
	private Boolean started;
	
	Car(){
		this.started=false;
		this.color = "grey";
		this.maxSpeed = 150f;
		this.currentSpeed = 0f;
		System.out.println("Creando auto");
	}
	
	public Car(String brand, String model, Float maxVelocity) {
		this.currentSpeed = 0f;
		this.started = false;
		this.brand = brand;
		this.model = model;
		this.maxSpeed = maxVelocity;
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
		if (this.started) {
			if (this.currentSpeed > 0) {
				this.currentSpeed--;
				System.out.println("El " + this.brand + " " + this.model + " va a " + this.currentSpeed + " km/h");
			}else {
				System.out.println("El auto no tiene velocidad");
			}
		}else {
			System.out.println("El auto esta apagado");
		}
		
	}
	
	void speedUp() {
		if (this.started) {
			if (this.currentSpeed < this.maxSpeed) {
				this.currentSpeed++;
			}
		}else {
			System.out.println("El auto esta apagado, por favor encenderlo");
		}
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Integer getChasis() {
		return chasis;
	}

	public void setChasis(Integer chasis) {
		this.chasis = chasis;
	}

	public Float getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(Float maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public Float getCurrentSpeed() {
		return currentSpeed;
	}

	public void setCurrentSpeed(Float currentSpeed) {
		this.currentSpeed = currentSpeed;
	}

	public Boolean getNewModel() {
		return newModel;
	}

	public void setNewModel(Boolean newModel) {
		this.newModel = newModel;
	}

	public Boolean getStarted() {
		return started;
	}

	public void setStarted(Boolean started) {
		this.started = started;
	}
	
	public boolean canSpeedUp() {
		return this.started && this.currentSpeed < this.maxSpeed;
	}
	
	
	
	
	
	
}
