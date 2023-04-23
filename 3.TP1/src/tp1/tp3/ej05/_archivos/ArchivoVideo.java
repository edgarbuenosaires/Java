package tp1.tp3.ej05._archivos;

public class ArchivoVideo extends ArchivoMultimedia {

	private FormatoVideo formato;
	private Dimension dimension;

	public ArchivoVideo(String nom, double pes, String loc, boolean abi, int dur, boolean rep, FormatoVideo formato,
			Dimension dimension) {
		super(nom, pes, loc, abi, dur, rep);
		this.formato = formato;
		this.dimension = dimension;
	}

	public boolean esFullHD() {
		return this.dimension.esFullHD();
	}

	public FormatoVideo getFormato() {
		return formato;
	}

}
