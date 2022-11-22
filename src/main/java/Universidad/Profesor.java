package Universidad;

public class Profesor extends Trabajador {

	public Profesor(String nombre, String rut, String estadoCivil, String tituloP, String direccion, String horario) {
		super(nombre,rut,estadoCivil,tituloP,direccion,horario);
	}

	public String getType() {
		return "Profesor";
	}
}