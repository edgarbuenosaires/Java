package ar.edu.ort.as.thp.tp2.ej09;

public class Persona {
	private String dni;
	private String nombre;
	private String apellido;
	private Domicilio domicilio;

	// CONSTRUCTOR
	public Persona(String dni, String nombre, String apellido, Domicilio domicilio) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.domicilio = domicilio;
	}

	// GETTERS & SETTERS
	public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Domicilio getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}
	// TO STRING

	@Override
	public String toString() {
		return "PERSONA\nNombre: " + nombre + " " + apellido + 
				" DNI: "+ dni+
				"\nDomicilio: " + domicilio;
	}

}
