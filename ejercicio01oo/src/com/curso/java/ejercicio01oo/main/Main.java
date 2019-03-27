package com.curso.java.ejercicio01oo.main;

import com.curso.java.ejercicio01oo.model.Aula;
import com.curso.java.ejercicio01oo.model.Persona;

public class Main {
	
	public static void main(String[] args) {
		System.out.print("Creando aula...");
		Aula aula = new Aula("Kepler", true, true, true, true, 6, 6, 6);
		System.out.println("¡Aula creada!");
		
		System.out.print("Añadiendo personas...");
		for(int i = 1; i <= aula.getNumeroDeOrdenadores(); i++) {
			Persona persona = new Persona("Id " + i);
			aula.insertarPersona(persona);
			aula.anadirPersonaPuesto(persona.getNombre(), i);
		}
		
		System.out.println("¡Añadidas!\n");
		System.out.println("Las personas que estan en clase son:");
		
		
		for(String key : aula.getPersonaPuesto().keySet()) {
			System.out.println("Puesto " + aula.obtenerPuesto(key) + ": " + key);
		}
		
		System.out.println("\n¡Descanso!\n");
		
		for(Persona p : aula.getPersonas()) {
			System.out.println("Persona " + p.comer());
		}
		
		System.out.println("\n¡Final de clase!\n");
		
		for(Persona p : aula.getPersonas()) {
			System.out.println(p.acabarClase());
		}

	}	
}
