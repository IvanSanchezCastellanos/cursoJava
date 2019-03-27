package com.curso.java.ejercicio01oodao.ejercicio01oodao;

import java.util.Collection;
import java.util.HashSet;

import com.curso.java.ejercicio01oo.model.Alumno;
import com.curso.java.ejercicio01oo.model.Aula;
import com.curso.java.ejercicio01oo.model.Persona;
import com.curso.java.ejercicio01oo.model.Profesor;

public class ListAulaDAO implements IAulaDAO {

	private HashSet<Aula> aulario = new HashSet<Aula>();

	public Collection<Alumno> listaAlumnos(Aula aula) {
		HashSet<Alumno> alumnos = new HashSet<Alumno>();
		for (Persona p : aula.getPersonas()) {
			if (p instanceof Alumno) {
				alumnos.add((Alumno) p);
			}
		}
		return alumnos;
	}

	public Collection<Profesor> listaProfesores(Aula aula) {
		HashSet<Profesor> profesores = new HashSet<Profesor>();
		for (Persona p : aula.getPersonas()) {
			if (p instanceof Profesor) {
				profesores.add((Profesor) p);
			}
		}
		return profesores;
	}

	public void asignarAlumno(Alumno alumno, Aula aula) {
		aulario.remove(aula);
		aula.insertarPersona(alumno);
		aulario.add(aula);
		System.out.println("Alumno asignado");
	}

	public void eliminarAula(Aula aula) {
		aulario.remove(aula);
		System.out.println("Aula eliminada");
	}

	public void createAula(Aula aula) {
		aulario.add(aula);
		System.out.println("Aula " + aula.getNombre() + " agregada");
	}

	public Collection<Aula> getAulas() {
		return aulario;
	}

	public Aula getAula(String nombre) {
		Aula sol = new Aula();
		for (Aula a : aulario) {
			if (a.getNombre().equals(nombre)) {
				sol = a;
				break;
			}
		}
		return sol;
	}

	public void updateAula(Aula aula) {
		for (Aula a : aulario) {
			if (a.getNombre().equals(aula.getNombre())) {
				aulario.remove(a);
				break;
			}
		}
		aulario.add(aula);
		System.out.println("Aula actualizada");
	}

	public void deleteAula(Aula aula) {
		for (Aula a : aulario) {
			if (a.getNombre().equals(aula.getNombre())) {
				aulario.remove(a);
				break;
			}
		}
		System.out.println("Aula eliminada");

	}
}
