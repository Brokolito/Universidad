package Universidad;

import java.util.ArrayList;
import Universidad.CarreraUniversitari;

public class Departamento {
	private String nombre;
	public ArrayList<CarreraUniversitari> carreras = new ArrayList<CarreraUniversitari>();

	public Departamento(String nombre) {
		throw new UnsupportedOperationException();
	}

	public String getNombre() {
		return this.nombre;
	}
}