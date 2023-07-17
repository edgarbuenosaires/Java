package tp1.tp4.ej04_TrenBsAs_Bragado;

public class Reserva {
	private String codigo;
	private int cantViajeros;
	private Recorrido recorrido;

	public double getPrecio() {
		return recorrido.getPrecio();
	}

	public int cantVecesRecorrida(Estacion est) {
		int cant = 0;

		if (recorrido.pasaPor(est)) {
			cant = cantViajeros;
		}
		return cant;
	}
}
