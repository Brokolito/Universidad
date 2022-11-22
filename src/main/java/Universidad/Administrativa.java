package Universidad;

public abstract class Administrativa extends Trabajador {
	private Facultad facultad;

	public Administrativa(String nombre, String rut, String estadoCivil, String tituloP, String direccion, String horario) {
		super(nombre, rut, estadoCivil, tituloP, direccion, horario);
	}

	@Override
	public String getType() {
		return "Administrativa";
	}
}