package tp1.tp4.ej03_SeleccionArgentina;

public class Seleccion {
	private final static int CANT_JUG = 23;
	private final static int CANT_TIT = 11;
	private final static int CANT_SUP = 7;
	private String nombre;
	private Jugador[] jugadores;

	public Seleccion(String nombre) {

		this.nombre = nombre;
		this.jugadores = new Jugador[CANT_JUG];
	}

	public void cambio(int numCamiseta1, int numCamiseta2) {

		/*
		 * Se recibe dos numeros de camisetas. Si no son iguales, se realiza el cambio
		 * de ubicacion de los jugadores en el plantel.
		 */

		int idx1; // ubicacion dentro del array
		int idx2; // ubicacion dentro del array

		if (validoNumCamiseta(numCamiseta1) && validoNumCamiseta(numCamiseta2) && numCamiseta1 != numCamiseta2) {
			idx1 = idxJugador(numCamiseta1); // busco la posicion dentro del array de camiseta 1.
			idx2 = idxJugador(numCamiseta2); // busco la posicion dentro del array de camiseta 2.
			intercambiar(idx1, idx2);
		}
	}

	public void cambioPorLesion(int camisetaLesionado, String apellidoReemplazante) {

		/*
		 * Se recibe el numero de camiseta de un jugadore lesionado y el apellido de su
		 * reemplazante. Reemplaza al lesionado por un nuevo jugador con el apellido
		 * recibido, con la misma posicion y numero que el que sale por lesion.
		 */

		int idxLesionado;
		Jugador jugadorLesionado;
		Jugador jugadorReemplazante;

		if (validoNumCamiseta(camisetaLesionado)) {
			idxLesionado = idxJugador(camisetaLesionado);
			jugadorLesionado = this.jugadores[idxLesionado];
			jugadorReemplazante = new Jugador(apellidoReemplazante, camisetaLesionado, jugadorLesionado.getPosicion());
			this.jugadores[idxLesionado] = jugadorReemplazante;
		}

	}

	public Jugador[] obtenerReservas() {

		// Devuelve a todos los jugadores de reserva de la seleccion.

		int cantJugadoresDeReserva;
		Jugador[] jugadoresDeRerserva;

		cantJugadoresDeReserva = CANT_JUG - CANT_TIT - CANT_SUP;
		jugadoresDeRerserva = new Jugador[cantJugadoresDeReserva];

		for (int i = 0; i < jugadoresDeRerserva.length; i++) {
			jugadoresDeRerserva[i] = this.jugadores[i + (CANT_JUG - cantJugadoresDeReserva)];
			/*
			 * a los 23 jugadores le resta la reserva y copia las posiciones desde ese
			 * punto.
			 */
		}

		return jugadoresDeRerserva;
	}

	public int[] cantJugadoresPorPosicion() {

//		Devuelve la cantidad de jugadores que hay por cada una de las posiciones en la cancha.

		Posicion[] posiciones;
		int[] cantidadDeJugadoresPorPosicion;

		posiciones = Posicion.values();
		cantidadDeJugadoresPorPosicion = new int[posiciones.length];

		for (int i = 0; i < this.jugadores.length; i++) {
			Posicion p = this.jugadores[i].getPosicion();
			cantidadDeJugadoresPorPosicion[p.ordinal()]++;
		}

		return cantidadDeJugadoresPorPosicion;
	}

	private int idxJugador(int nroDeCamiseta) {

		// Busco la posicion dentro del array de un jugador por el nro de su camiseta.

		int i = this.jugadores.length - 1;
		boolean jugEncontrado = false;

		while (i >= 0 && !jugEncontrado) {
			if (this.jugadores[i] != null && this.jugadores[i].getNroCamiseta() == nroDeCamiseta) {
				jugEncontrado = true;
			} else {
				i--;
			}
			// Recorre para atras para que, si no se encuentra, devuelva -1
		}
		return i;
	}

	private boolean validoNumCamiseta(int num) {
		final int MIN = 1;
		return num >= MIN && num <= CANT_JUG;
	}

	private void intercambiar(int num1, int num2) {
		Jugador aux;
		aux = this.jugadores[num1];
		this.jugadores[num1] = this.jugadores[num2];
		this.jugadores[num2] = aux;
	}

}
