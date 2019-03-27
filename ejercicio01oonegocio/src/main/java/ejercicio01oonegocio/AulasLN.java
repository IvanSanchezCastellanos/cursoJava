package ejercicio01oonegocio;

import java.util.Collection;
import java.util.HashSet;

import com.curso.java.ejercicio01oo.model.Alumno;
import com.curso.java.ejercicio01oo.model.Aula;
import com.curso.java.ejercicio01oo.model.Persona;
import com.curso.java.ejercicio01oo.model.Profesor;
import com.curso.java.ejercicio01oodao.ejercicio01oodao.IAulaDAO;

public class AulasLN {
	private IAulaDAO aulaDao;

	public AulasLN(IAulaDAO aulaDao) {
		super();
		this.aulaDao = aulaDao;
	}

	public void nuevoAula(String nombre, boolean pizarra, boolean puestoProfesor, boolean proyector,
			boolean aireAcondicionado, int numeroDeOrdenadores, int numeroDeMesas, int aream2) {

		aulaDao.createAula(new Aula(nombre, pizarra, puestoProfesor, proyector, aireAcondicionado, numeroDeOrdenadores,
				numeroDeMesas, aream2));
		System.out.println("Aula creada");
	}

	public Collection<Alumno> listarAlumnos(String nombreAula) {
		Aula miAula = new Aula();
		miAula = aulaDao.getAula(nombreAula);
		HashSet<Alumno> alumnos = new HashSet<Alumno>();
		for (Persona p : miAula.getPersonas()) {
			if (p instanceof Alumno) {
				alumnos.add((Alumno) p);
			}
		}
		return alumnos;
	}

	public Collection<Profesor> listarProfesores(String nombreAula) {
		Aula miAula = new Aula();
		miAula = aulaDao.getAula(nombreAula);
		HashSet<Profesor> profesores = new HashSet<Profesor>();
		for (Persona p : miAula.getPersonas()) {
			if (p instanceof Profesor) {
				profesores.add((Profesor) p);
			}
		}
		return profesores;
	}

	public void asignarAlumnos(Alumno alumno, Aula aula) {
		aula.insertarPersona(alumno);
		aulaDao.updateAula(aula);
		System.out.println("Alumno asignado");
	}

	public void eliminarAulas(Aula aula) {
		aulaDao.deleteAula(aula);
	}
}
