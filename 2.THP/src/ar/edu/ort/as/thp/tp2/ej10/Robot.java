package ar.edu.ort.as.thp.tp2.ej10;

public class Robot {
	private String nombre;

	/*
	 * Con el doble encapsulamiento utilizo los set y get para mostrar y
	 * modificar atributos
	 */

	// Constructor sin parametros:
	public Robot() {
		this.setNombre(""); // doble encapsulamiento
	}
	/*
	 * Constructor con parametros, se pone el this para identificar que es el
	 * nombre de la clase diferente al String que es el parametro que se le
	 * envia.
	 */

	// Constructor con parametros:
	public Robot(String nombre) {
		this.setNombre(nombre); // doble encapsulamiento
	}

	// Metodo SETER
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// Metodo GETER
	public String getNombre() {
		return this.nombre;
	}

	public void saludar() {
		this.saludar("");
		;
	}

	public void saludar(Persona persona) {
		if (persona != null) {
			this.saludar(persona.getNombre());
		} else {
			this.saludar();
		}
	}

	public void saludar(String nombre) {
		if (nombre.length() > 0) {
			nombre = " " + nombre;
		}
		System.out.println("Hola" + nombre + ", mi nombre es " + this.getNombre() + ". En que puedo ayudarte?");
//		sUtilizo el this.getNombre como doble encapsulamiento
	}
}
