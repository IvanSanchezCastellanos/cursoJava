package com.curso.java.ejercicio01oodao.ejercicio01oodao;

import java.util.Collection;
import java.util.HashMap;

import com.curso.java.ejercicio01oo.model.Aula;

public class MapAulaDAO implements IAulaDAO {

	private HashMap<String, Aula> aulario = new HashMap<String, Aula>();

	public void createAula(Aula aula) {
		aulario.put(aula.getNombre(), aula);
		System.out.println("Aula creada");

	}

	public Collection<Aula> getAulas() {
		return aulario.values();

	}

	public Aula getAula(String nombre) {
		return aulario.get(nombre);
	}

	public void updateAula(Aula aula) {
		aulario.remove(aula.getNombre());
		aulario.put(aula.getNombre(), aula);
		System.out.println("Aula actualizada");
	}

	public void deleteAula(Aula aula) {
		aulario.remove(aula.getNombre());
		System.out.println("Aula eliminada");

	}

}
