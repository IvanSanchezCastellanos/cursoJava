package com.curso.java.ejercicio01oo.model;

public class Profesor extends Persona {
		
		public Profesor(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
		}

		// Atributos
		private Valoraciones valoracion;
		private String descripcionCurso;
		private double sueldo;
		
		
		// Metodos
		// Getters/Setters
		public Valoraciones getValoracion() {
			return valoracion;
		}
		
		public void setValoracion(Valoraciones valoracion) {
			this.valoracion = valoracion;
		}
		
		public String getDescripcionCurso() {
			return descripcionCurso;
		}
		
		public void setDescripcionCurso(String descripcionCurso) {
			this.descripcionCurso = descripcionCurso;
		}
		
		public double getSueldo() {
			return sueldo;
		}
		
		public void setSueldo(double sueldo) {
			this.sueldo = sueldo;
		}
}
