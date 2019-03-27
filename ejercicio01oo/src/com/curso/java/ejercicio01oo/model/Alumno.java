package com.curso.java.ejercicio01oo.model;

public class Alumno extends Persona {
	
	public Alumno(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	// Atributos
	private int faltasAsistencia;
	private int numeroPuesto;

	// Metodos
	// Getters/Setters
	public int getFaltasAsistencia() {
		return faltasAsistencia;
	}

	public void setFaltasAsistencia(int faltasAsistencia) {
		this.faltasAsistencia = faltasAsistencia;
	}

	
}
