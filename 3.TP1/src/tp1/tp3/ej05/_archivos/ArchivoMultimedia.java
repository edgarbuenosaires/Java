package tp1.tp3.ej05._archivos;

public abstract class ArchivoMultimedia extends Archivo {

	private int duracion;
	private boolean reproduciendo;

	public ArchivoMultimedia(String nom, double pes, String loc, boolean abi, int dur, boolean rep) {
		super(nom, pes, loc, abi);
		this.duracion = dur;
		this.reproduciendo = rep;
	}

	public boolean repoducir() {
		return false;
	}

	public boolean parar() {
		return false;
	}

	public int getDuracion() {
		return this.duracion;
	}

	public boolean isReproduciendo() {
		return reproduciendo;
	}

}
