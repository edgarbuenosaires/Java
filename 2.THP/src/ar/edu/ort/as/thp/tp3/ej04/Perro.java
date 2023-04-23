package ar.edu.ort.as.thp.tp3.ej04;

public class Perro {
	private String nombre;
	private Collar collar;

	public Perro(String nombre) {
		this.nombre = nombre;
		this.collar = null;
	}

	public void ponerCollar(Collar collar) {
		this.collar = collar;
		this.moverCola();
	}

	public void moverCola() {
		System.out.println(this.nombre + ": Estoy contento porque voy a salir");
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		return "Perro:" + nombre + " " + collar;
	}

}
