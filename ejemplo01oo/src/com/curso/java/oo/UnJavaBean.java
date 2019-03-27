package com.curso.java.oo;

public class UnJavaBean {
	// Tipos de visibilidad: public, protected, private y package(tambien llamado default)
	// Un javaBean solo tiene atributos private
	private String campo;
	//public Double campo2;
	//protected boolean campo3;
	//BigDecimal campo4;

	public String getCampo() {
		return campo;
	}

	public void setCampo(String campo) {
		this.campo = campo;
	}
	
	
}
