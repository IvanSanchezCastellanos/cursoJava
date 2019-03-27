package com.curso.java.ejercicio01oo.model;

import java.util.Date;

public class Persona implements Tareas {
	
	// Atributos
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String telefono;
	private Date fechaDeNacimiento;
	
	
	public Persona(String nombre) {
		this.nombre = nombre;
		this.apellido1 = "ap1";
		this.apellido2 = "ap2";
		this.telefono = "NumTelefono";
		this.fechaDeNacimiento = new Date();
	}
	
	// Metodos
	// Getters/Setters
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido1() {
		return apellido1;
	}
	
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	
	public String getApellido2() {
		return apellido2;
	}
	
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	
	public String getTelefono() {
		return telefono;
	}
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public Date getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	
	public void setFechaDeNacimiento(Date fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
		
	// Metodos interfaz tareasAlumno
	@Override
	public String comer() {
		
		return getNombre() + " se va a comer " + Comida.values()[(int)(Math.random() * 5)] + " a " + Lugares.values()[(int)(Math.random() * 4)];	
	}

	@Override
	public String acabarClase() {
		return getNombre() + " ha recogido todo. Se marcha...";			
	}
}
