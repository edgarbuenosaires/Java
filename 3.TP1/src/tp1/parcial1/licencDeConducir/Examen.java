package tp1.parcial1.licencDeConducir;

public class Examen {
	private String fecha;
	private Persona persona;
	private Vehiculo vehiculo;

	public Examen(String fecha, Persona persona, Vehiculo vehiculo) {
		super();
		this.fecha = fecha;
		this.persona = persona;
		this.vehiculo = vehiculo;
	}
	
	public boolean aprobo() {
		return false;
	}

}
