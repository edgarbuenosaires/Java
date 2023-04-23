package tp1.tp3.ej05._archivos;

public class Archivo {
	private String nombre;
	private double peso;
	private String localizacion;
	private boolean abierto;

	public Archivo(String nombre, double peso, String localizacion, boolean abierto) {
		super();
		this.nombre = nombre;
		this.peso = peso;
		this.localizacion = localizacion;
		this.abierto = abierto;
	}

	public void abrir() {

	}

	public void cerrar() {
		this.abierto = false;
	}

	public boolean estaAbierto() {
		return abierto;
	}

	public String getLocalizacion() {
		return localizacion;
	}

	public String getNombre() {
		return nombre;
	}

	public double getPeso() {
		return peso;
	}

}
