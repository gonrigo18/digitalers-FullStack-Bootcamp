package com.digitalers.clase6;

public class Export {
	
	public void export(TipoEnum tipo) {
		if (TipoEnum.CSV.equals(tipo) 
				|| TipoEnum.PDF.equals(tipo) 
					|| TipoEnum.XLS.equals(tipo)) {
			System.out.println("formato valido");
		}else {
			System.out.println("Formato invalido");
		}
	
	}

}
