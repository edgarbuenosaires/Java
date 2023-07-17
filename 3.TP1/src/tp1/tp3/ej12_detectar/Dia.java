package tp1.tp3.ej12_detectar;

import java.util.ArrayList;

public class Dia {
	private final static String NOTIFICACION = "No hay cupos para hoy";
	private String fecha;
	private boolean esHabil;
	private ArrayList<Persona> personas;

	public Dia(String fecha, boolean esHabil) {
		super();
		this.fecha = fecha;
		this.esHabil = esHabil;
		this.personas = new ArrayList<>();
	}

	public double promedioEdadPersonasSinOS() {
		int acuEdades = 0;
		int cantEdades = 0;
		double promedio = 0;

		for (Persona p : personas) {
			if (!(p instanceof PersonaObraSocial)) {
				cantEdades++;
				acuEdades += p.getEdad();
			}
			if (cantEdades > 0) {
				promedio = acuEdades / cantEdades;
			}
		}
		return promedio;
	}

	public int cantPersonasPorPrioridad(int numPrioridad) {

		int cant = 0;

		for (Persona p : personas) {
			if (p.getPrioridad() == numPrioridad) {
				cant++;
			}
		}
		return cant;
	}

	public int getCantPersonas() {
		return this.personas.size();
	}

	public String getFecha() {
		return this.fecha;
	}

	public int revisar(int capacidad) {
		int cantAfuera;

		for (int i = capacidad; i < getCantPersonas(); i++) {
			this.personas.get(i).notificar(NOTIFICACION);
		}
		cantAfuera = getCantPersonas() - capacidad;

		if (cantAfuera < 0) {
			cantAfuera = 0;
		}
		return cantAfuera;
	}

}
