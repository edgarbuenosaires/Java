package tp1.tp4.ej10_cicloDeCharlas;

public class CicloDeCharla {
	public final static int MAX_CHARLAS_POR_TANDA = 5;
	public final static int MAX_ESPECTADORES = 50;
	public final static int DIAS_ENTRE_TANDAS = 10;
	public final static int CANT_TANDAS = 2;
	private String titulo;
	private Charla[][] charlas;

	public CicloDeCharla(String titulo, Pelicula[] peli, Fecha fecha, int num) {
		super();
		this.titulo = titulo;
		this.charlas = new Charla[CANT_TANDAS][MAX_CHARLAS_POR_TANDA];
	}

	public Ticket registrarEspectadorEnCharla(String nom, int num) {
		return null;
	}

	public void verCartelera() {

	}

}
