package tp1.tp4.ej03_SeleccionArgentina;

public class Jugador {
	private String apellido;
	private int nroCamiseta;
	private Posicion posicion;

	public Jugador(String apellido, int nroCamiseta, Posicion posicion) {
		this.apellido = apellido;
		this.nroCamiseta = nroCamiseta;
		this.posicion = posicion;
	}

	public String getApellido() {
		return apellido;
	}

	public int getNroCamiseta() {
		return nroCamiseta;
	}

	public Posicion getPosicion() {
		return posicion;
	}

}
