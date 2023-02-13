package com.digitalers.clase6;

public enum TipoEnum {

	CSV("csv"), PDF("pdf"), XLS("xls");

	private String tipo;

	private TipoEnum(String tipo) {
		this.tipo = tipo;
	}

	public String getTipo() {
		return this.tipo;
	}

	public static TipoEnum getEnum(String tipoIngresadoPorUsuario) {
		TipoEnum[] tipos = TipoEnum.values();

		TipoEnum tipoValido = null;
		for (TipoEnum UnEnum : tipos) {
			if (UnEnum.getTipo().equalsIgnoreCase(tipoIngresadoPorUsuario)) {
				tipoValido = UnEnum;
				break;
			}
		}
		return tipoValido;
	}

}
