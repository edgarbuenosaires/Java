package tp1.tp3.ej05._archivos;

public class Dimension {
	private int alto;
	private int ancho;

	public boolean esFullHD() {
		return this.ancho >= 1920 && this.alto >= 1080;
	}
}