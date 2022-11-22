package Universidad;

public abstract class Trabajador {
	private String nombre;
	private String rut;
	private String estadoCivil;
	private String tituloP;
	private String direccion;
	private String horario;

	public String getNombre() {
		return this.nombre;
	}

	public void getRut() {
		throw new UnsupportedOperationException();
	}

	public String getEstadoCivil() {
		return this.estadoCivil;
	}

	public String getTituloP() {
		return this.tituloP;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public String getHorario() {
		return this.horario;
	}

	public abstract String getType();

	public Trabajador(String nombre, String rut, String estadoCivil, String tituloP, String direccion, String horario) {
		this.nombre=nombre;
		this.rut=rut;
		this.estadoCivil=estadoCivil;
		this.tituloP=tituloP;
		this.direccion=direccion;
		this.horario=horario;
	}
}