package ejercicio01ooLanzadorMap;

import com.curso.java.ejercicio01oo.model.Alumno;
import com.curso.java.ejercicio01oo.model.Aula;
import com.curso.java.ejercicio01oodao.ejercicio01oodao.MapAulaDAO;

import ejercicio01oonegocio.AulasLN;

public class LanzadorAulaMap {
	public static void main(String[] args) {
		MapAulaDAO n = new MapAulaDAO();

		AulasLN negocio = new AulasLN(n);

		negocio.nuevoAula("Galileo", true, true, true, true, 14, 5, 7);
		negocio.nuevoAula("Keppler", true, true, false, true, 14, 14, 7);
		negocio.nuevoAula("Copernico", true, false, true, true, 5, 14, 7);

		Alumno alumno1 = new Alumno("Pedro");
		Alumno alumno2 = new Alumno("Juan");
		Alumno alumno3 = new Alumno("Marta");
		Alumno alumno4 = new Alumno("Jorge");

		Aula aula = new Aula("Galileo", true, true, true, true, 14, 14, 7);
		Aula aula2 = new Aula("Keppler", true, true, false, true, 14, 14, 7);

		negocio.asignarAlumnos(alumno1, aula);
		negocio.asignarAlumnos(alumno2, aula);
		negocio.asignarAlumnos(alumno3, aula);
		negocio.asignarAlumnos(alumno4, aula);

		System.out.println(
				"\n\nLista de alumnos del aula " + aula.getNombre() + ": \n" + negocio.listarAlumnos(aula.getNombre()));
		System.out.println("\n\nLista de profesores del aula " + aula.getNombre() + ": \n"
				+ negocio.listarProfesores(aula.getNombre()));

		System.out.println("\n\nTenemos las siguientes aulas:");
		System.out.println(n.getAulas());

		System.out.println("\n\nTomamos el aula Galileo:");
		System.out.println(n.getAula("Galileo"));

		System.out.println("\n\nEliminamos el aula Keppler:");
		negocio.eliminarAulas(aula2);

		System.out.println("\n\nLista de aulas actual:");
		System.out.println(n.getAulas());
	}
}
