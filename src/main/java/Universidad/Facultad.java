package Universidad;

import java.util.ArrayList;
import Universidad.Departamento;
import Universidad.Profesor;
import Universidad.Administrativa;

public class Facultad {
	private String nombre;
	private ArrayList<Departamento> departamentos;
	private ArrayList<Profesor> profesores;
	private ArrayList<Administrativa> administradores;

	public Facultad(String nombre) {
		this.nombre=nombre;
		this.departamentos=new ArrayList<Departamento>();
		this.profesores=new ArrayList<Profesor>();
		this.administradores= new ArrayList<Administrativa>();
	}

	public ArrayList<Departamento> getDepartamentos() {
		return this.departamentos;
	}

	public ArrayList<Profesor> getProfesores() {
		return this.profesores;
	}

	public ArrayList<Administrativa> getAdministradores() {
		return this.administradores;
	}

	public String getNombre() {
		return this.nombre;
	}
}