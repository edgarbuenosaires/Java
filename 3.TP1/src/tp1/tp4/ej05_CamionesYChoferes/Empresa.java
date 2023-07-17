package tp1.tp4.ej05_CamionesYChoferes;

import java.util.ArrayList;

public class Empresa {
	private static final int CANT_CAMIONES = 10;
	private static final int CANT_CHOFERES = 20;
	private Camion[] camiones;
	private Chofer[] choferes;
	private ArrayList<Viaje> viajes;

	public Empresa(Camion[] camiones, Chofer[] choferes, ArrayList<Viaje> viajes) {
		super();
		this.camiones = new Camion[CANT_CAMIONES];
		this.choferes = new Chofer[CANT_CHOFERES];
		this.viajes = new ArrayList<>();
	}

	public double[] obtenerCostosDeViajes() {

		// Devuelve el costo aproximado de cada viaje (honorarios + consumo).

		Camion camion;
		Chofer chofer;
		int cantViajes = this.viajes.size();
		double costoDelViaje;
		double[] costos;

		costos = new double[cantViajes];
		for (int v = 0; v < cantViajes; v++) {
			Viaje viaje = this.viajes.get(v);

			// Camion por posicionamiento directo
			camion = this.camiones[viaje.getIdCamion()];
			costoDelViaje = camion.getCostoXKm() * viaje.getKms();

			// Chofer por posicionamiento indirecto
			chofer = buscarChofer(viaje.getIdChofer());
			if (chofer != null) {
				costoDelViaje += chofer.getPagoXViaje();
			}
			costos[v] = costoDelViaje;
		}
		return costos;
	}

	private Chofer buscarChofer(String id) {

		Chofer chofer = null;
		int posicionamientoChofer = idxChofer(id);

		if (posicionamientoChofer != -1) {
			chofer = this.choferes[posicionamientoChofer];
		}
		return chofer;
	}

	private int idxChofer(String id) {
		int i = this.choferes.length - 1;
		while (i >= 0 && this.choferes[i].getID() != id) {
			// Se recorre para atras para que, si no se encuentra, se devuelva -1;
			i--;
		}
		return i;

	}

	public int[][] obtenerViajesXChoferCamion() {

		// Devuelve la cantidad de viajes que realizo cada chofer con cada camion.

		int[][] cantidades;
		cantidades = new int[this.choferes.length][this.camiones.length];
		
		for (Viaje v : this.viajes) {
			int iChofer = idxChofer(v.getIdChofer());
			int iCamion = v.getIdCamion();

			// cantidades[iChofer][iCamion] = cantidades[iChofer][iCamion] + 1;

			cantidades[iChofer][iCamion]++;
		}
		return cantidades;
	}

}
