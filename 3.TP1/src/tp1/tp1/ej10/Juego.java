package tp1.tp1.ej10;

import java.util.ArrayList;

public class Juego {
	private String nombre;
	private ArrayList<Mesa> mesas;

	public Juego(String nombre) {
		super();
		this.nombre = nombre;
		this.mesas = new ArrayList<>();
	}

	public int dameLugaresDisp() {
		int cantLugares = 0;
		for (Mesa m : this.mesas) {
			cantLugares = m.dameLugaresDisp();
		}
		return cantLugares;
	}

	public Resultado acomodarJugador(String nomJug, int edad) {
		Resultado res = Resultado.SIN_DISPONIBILIDAD;
		// int i = 0;

		Mesa mesa = mesaConMasParticipantes();
		if (mesa != null) {
			mesa.agregarParticipante(new Participante(nomJug, edad));
			res = Resultado.ASIGNACION_OK;

		}

		return res;
	}

	public Mesa mesaConMasParticipantes() {
		int maxParticipantes = -1;
		Mesa mesaMax = null;
		
		for (Mesa m : this.mesas) {
			int cant = m.cantParticipantes();
			if (cant > maxParticipantes && m.dameLugaresDisp() > 0) {
				maxParticipantes = cant;
				mesaMax = m;
			}
		}
		return mesaMax;
	}

	public String getNombre() {
		return this.nombre;
	}
}
