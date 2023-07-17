package tp1.tp4.ej08_asientosDeAvion;

public class Avion {
	private final static int FILAS = 16;
	private final static int ASIENTOS_POR_FILA = 6;
	private String marca;
	private Asiento[][] asientos;

	public Avion(String marca) {
		super();
		this.marca = marca;
		this.asientos = new Asiento[FILAS][ASIENTOS_POR_FILA];
	}

	public int asientosLibresConVentallia() {
		int primerCol = 0;
		int ultCol = ASIENTOS_POR_FILA - 1;
		int cant = 0;

		for (int c = primerCol; c <= ultCol; c++) {
			cant += cantAsientosEnColumnaPorEstado(c, Estado.LIBRE);
		}
		return cant;

	}

	public void resevar(int nroAsiento) {
		int fila;
		int columna;

		if (esAsientoValido(nroAsiento)) {
			fila = (nroAsiento - 1) / ASIENTOS_POR_FILA;
			columna = (nroAsiento - 1) % ASIENTOS_POR_FILA;
			this.asientos[fila][columna].reservar();
		}
	}

	private boolean esAsientoValido(int nro) {
		return nro >= 1 && nro <= FILAS * ASIENTOS_POR_FILA;
	}

	private int cantAsientosEnColumnaPorEstado(int nroColumna, Estado elEstado) {
		int cant = 0;

		for (int f = 0; f < FILAS; f++) {
			Asiento a = this.asientos[f][nroColumna];
			if (a.getEstado() == elEstado) {
				cant++;
			}
		}
		return cant;
	}
}
