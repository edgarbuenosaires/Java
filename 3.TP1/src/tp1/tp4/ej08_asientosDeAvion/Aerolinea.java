package tp1.tp4.ej08_asientosDeAvion;

import java.util.ArrayList;

public class Aerolinea {
	private ArrayList<Reserva> reservas;
	private Avion elAvion;

	public void asignar() {
		for (Reserva r : this.reservas) {
			this.elAvion.resevar(r.getNroAsiento());
		}
	}
}
