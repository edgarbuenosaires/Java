package tp1.tp4.ej04_TrenBsAs_Bragado;

public class Recorrido {
	private final static double PRECIO_X_ESTACION = 50;
	private final static double DESCUENTO = 0.2;
	private Estacion estacionOrigen;
	private Estacion estacionDestino;

	public double getPrecio() {
		double precio;

		precio = cantEstacionesRecorridas() * PRECIO_X_ESTACION;
		if (fueCompleto()) {
			precio = precio - precio * DESCUENTO;
		}
		return precio;
	}

	private int cantEstacionesRecorridas() {
		int idx1;
		int idx2;
		int cant;

		idx1 = this.estacionDestino.ordinal();
		idx2 = this.estacionOrigen.ordinal();
		cant = idx1 - idx2;
		if (cant < 0) {
			cant = -cant;
		}
		return cant;
	}

	public boolean pasaPor(Estacion est) {
		int idxEstacionOrigen = estacionOrigen.ordinal();
		int idxEstacionDestino = estacionDestino.ordinal();
		int idxEstacion = est.ordinal();

		if (idxEstacionOrigen > idxEstacionDestino) {
			// Se invierten las variables por si el tren va de Bragado a Buenos Aires.
			int aux = idxEstacionOrigen;
			idxEstacionOrigen = idxEstacionDestino;
			idxEstacionDestino = aux;
		}
		return idxEstacion >= idxEstacionOrigen && idxEstacion <= idxEstacionDestino;
	}

	private boolean fueCompleto() {
		return cantEstacionesRecorridas() == Estacion.values().length - 1;
	}
}
