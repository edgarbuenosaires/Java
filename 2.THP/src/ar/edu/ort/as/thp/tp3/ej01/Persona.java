package ar.edu.ort.as.thp.tp3.ej01;

public class Persona {
	private String dni;
	private String nombre;
	private String apellido;
	private int edad;
	private char sexo;
	private Domicilio domicilio;

	// CONSTRUCTOR:

	// private Persona() {
	// this.dni = "";
	// this.nombre = "";
	// this.apellido = "";
	// this.edad = 0;
	// this.domicilio = null;
	// }

	public Persona(String dni, String nombre, String apellido, int edad, char sexo, Domicilio domicilio) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.sexo = sexo;
		this.domicilio = domicilio;
	}

	public String getDni() {
		return dni;
	}

	@Override
	public String toString() {
		return "DNI: " + dni + " - " + nombre + " " + apellido + " - " + edad + " " + sexo + " Domicilio: " + domicilio;
	}

	public void mostrar() {
		System.out.println(this);

	}

	public void setDomicilio(Domicilio domi) {
		this.domicilio = domi;

	}

}
