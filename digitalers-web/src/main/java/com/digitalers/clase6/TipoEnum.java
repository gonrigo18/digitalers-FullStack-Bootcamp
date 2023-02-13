package com.digitalers.clase6;

public enum TipoEnum {
	
	CSV("csv"),
	PDF("pdf"),
	XLS("xls");
	
	private String tipo;
	
	private TipoEnum(String tipo) {
		this.tipo = tipo;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	
}
