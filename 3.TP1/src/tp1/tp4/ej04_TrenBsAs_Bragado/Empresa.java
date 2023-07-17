package tp1.tp4.ej04_TrenBsAs_Bragado;

import java.util.ArrayList;

public class Empresa {
	private ArrayList<Reserva> reservas;

	public Empresa() {
		this.reservas = new ArrayList<>();
	}

	public double recaudacionTotal() {
		double acu = 0;
		for (Reserva r : reservas) {
			acu += r.getPrecio();
		}
		return acu;
	}

	public int cantVecesRecorrida(Estacion est) {
		int acuVeces = 0;

		for (Reserva r : reservas) {
			acuVeces += r.cantVecesRecorrida(est);
		}
		return acuVeces;
	}

}
