package com.digitalers.clase6;

public class FileParserMain {

	public static void main(String[] args) {


		String tipoIngresadoPorUsuario = "pepe";
		
		TipoEnum[] tipos = TipoEnum.values();
		
		for (TipoEnum UnEnum : tipos) {
			if(UnEnum.getTipo().equalsIgnoreCase(tipoIngresadoPorUsuario));
		}
	}

}