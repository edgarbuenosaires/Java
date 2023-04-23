package tp1.tp3.ej13softwareTest;

public abstract class Fuente {
	private String nombre;
	private String ubicacion;

	public Fuente(String nombre, String ubicacion) {
		super();
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}

	public abstract double indiceDeCalidad();
}
