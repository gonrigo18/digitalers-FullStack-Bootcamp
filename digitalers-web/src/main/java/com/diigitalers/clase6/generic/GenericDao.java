package com.diigitalers.clase6.generic;

public abstract class GenericDao<T>{
	
	protected String tabla;
	
	
	public GenericDao(String tabla) {
		this.tabla = tabla;
	}


	public T[] findAll() {
		String sql = "select * from " + this.tabla;
		
		System.err.println(sql);
		
		T[] retorno = null;
		return retorno;
	}
}
