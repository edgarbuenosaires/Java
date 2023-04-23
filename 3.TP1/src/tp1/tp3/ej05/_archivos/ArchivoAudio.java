package tp1.tp3.ej05._archivos;

public class ArchivoAudio extends ArchivoMultimedia {
	private String artista;
	private String album;
	private FormatoAudio formato;

	public ArchivoAudio(String nom, double pes, String loc, boolean abi, int dur, boolean rep, String artista,
			String album, FormatoAudio formato) {
		super(nom, pes, loc, abi, dur, rep);
		this.artista = artista;
		this.album = album;
		this.formato = formato;
	}

	public String getArtista() {
		return artista;
	}

	public String getAlbum() {
		return album;
	}

	public FormatoAudio getFormato() {
		return formato;
	}

}
