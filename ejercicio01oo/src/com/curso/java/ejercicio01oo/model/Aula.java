package com.curso.java.ejercicio01oo.model;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Aula {

	// Declaracion atributos
	private boolean pizarra;
	private boolean puestoProfesor;
	private boolean proyector;
	private boolean aireAcondicionado;
	private int numeroDeOrdenadores;
	private int numeroDeMesas;
	private int aream2;
	private Map<String, Integer> personaPuesto;
	private Map<Persona, Integer> personaPuesto2;
	private Set<Persona> personas;
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// Metodos
	// Constructor
	public Aula() {
		this.pizarra = false;
		this.puestoProfesor = false;
		this.proyector = false;
		this.aireAcondicionado = false;
		this.numeroDeOrdenadores = 0;
		this.numeroDeMesas = 0;
		this.aream2 = 0;
		this.personaPuesto = new HashMap<String, Integer>();
		;
		this.personaPuesto2 = new HashMap<Persona, Integer>();
		this.personas = new HashSet<Persona>();
		this.nombre = "";
	}

	public Aula(String nombre, boolean pizarra, boolean puestoProfesor, boolean proyector, boolean aireAcondicionado,
			int numeroDeOrdenadores, int numeroDeMesas, int aream2) {
		this.pizarra = pizarra;
		this.puestoProfesor = puestoProfesor;
		this.proyector = proyector;
		this.aireAcondicionado = aireAcondicionado;
		this.numeroDeOrdenadores = numeroDeOrdenadores;
		this.numeroDeMesas = numeroDeMesas;
		this.aream2 = aream2;
		this.personaPuesto = new HashMap<String, Integer>();
		;
		this.personaPuesto2 = new HashMap<Persona, Integer>();
		this.personas = new HashSet<Persona>();
		this.nombre = nombre;
	}

	// Getters/Setters
	public Map<String, Integer> getPersonaPuesto() {
		return personaPuesto;
	}

	public void setPersonaPuesto(Map<String, Integer> personaPuesto) {
		this.personaPuesto = personaPuesto;
	}

	public boolean isPizarra() {
		return pizarra;
	}

	public void setPizarra(boolean pizarra) {
		this.pizarra = pizarra;
	}

	public boolean isPuestoProfesor() {
		return puestoProfesor;
	}

	public void setPuestoProfesor(boolean puestoProfesor) {
		this.puestoProfesor = puestoProfesor;
	}

	public boolean isProyector() {
		return proyector;
	}

	public void setProyector(boolean proyector) {
		this.proyector = proyector;
	}

	public boolean isAireAcondicionado() {
		return aireAcondicionado;
	}

	public void setAireAcondicionado(boolean aireAcondicionado) {
		this.aireAcondicionado = aireAcondicionado;
	}

	public int getNumeroDeOrdenadores() {
		return numeroDeOrdenadores;
	}

	public void setNumeroDeOrdenadores(int numeroDeOrdenadores) {
		this.numeroDeOrdenadores = numeroDeOrdenadores;
	}

	public int getNumeroDeMesas() {
		return numeroDeMesas;
	}

	public void setNumeroDeMesas(int numeroDeMesas) {
		this.numeroDeMesas = numeroDeMesas;
	}

	public int getAream2() {
		return aream2;
	}

	public void setAream2(int aream2) {
		this.aream2 = aream2;
	}

	public Integer obtenerPuesto(String nombre) {
		return personaPuesto.get(nombre);
	}

	public void anadirPersonaPuesto(String nombre, int puesto) {
		personaPuesto.put(nombre, puesto);

	}

	public void anadirPersonaPuesto2(Persona persona, int puesto) {
		personaPuesto2.put(persona, puesto);

	}

	public Integer obtenerPuesto2(String nombre) {
		return personaPuesto.get(nombre);
	}

	public Map<Persona, Integer> getPersonaPuesto2() {
		return personaPuesto2;
	}

	public void setPersonaPuesto2(Map<Persona, Integer> personaPuesto2) {
		this.personaPuesto2 = personaPuesto2;
	}

	public Set<Persona> getPersonas() {
		return personas;
	}

	public void setPersonas(Set<Persona> personas) {
		this.personas = personas;
	}

	public void insertarPersona(Persona persona) {
		personas.add(persona);
	}
}
