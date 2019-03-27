package com.curso.java.ejercicio01oodao.ejercicio01oodao;

import java.util.Collection;

import com.curso.java.ejercicio01oo.model.Aula;

public interface IAulaDAO {

	void createAula(Aula aula);

	Collection<Aula> getAulas();

	Aula getAula(String nombre);

	void updateAula(Aula aula);

	void deleteAula(Aula aula);
}
