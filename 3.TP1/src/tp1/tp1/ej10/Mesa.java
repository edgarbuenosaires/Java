package tp1.tp1.ej10;

import java.util.ArrayList;

public class Mesa {
	private final static int CANT_CARTAS_CADA_UNO = 4;
	private int numero;
	private int cantParticipantesMax;
	private ArrayList<Participante> participantes;
	private ArrayList<Mazo> mazo;

	public Mesa(int numero, int cantParticipantesMax) {
		super();
		this.numero = numero;
		this.cantParticipantesMax = cantParticipantesMax;
		this.participantes = new ArrayList<>();
		this.mazo = new ArrayList<>();
	}

	public int dameLugaresDisp() {
		return this.cantParticipantesMax - this.participantes.size();
	}

	public boolean repartirCartas() {
		boolean sePuedeRepartir;
		sePuedeRepartir = hayParticipantesSuficientes() && hayCartasSuficientes();
		if (sePuedeRepartir) {
			efectuarReparticion();
		}

		return sePuedeRepartir;
	}

	private boolean hayParticipantesSuficientes() {
		final int PARTICIPANTES_MIN = 2;
		return this.participantes.size() >= PARTICIPANTES_MIN;
	}

	private boolean hayCartasSuficientes() {
		// return this.participantes.size() * Mesa.CANT_CARTAS_CADA_UNO <=
		// this.mazo.cantCartas();
		return false;
	}

	private void efectuarReparticion() {
		/*
		 * //for (int i = 1, Mesa.CANT_CARTAS_CADA_UNO , 1) { for (Participante p :
		 * this.participantes) { System.out.println("Repartiendo carta "+ i
		 * +" para "+p.getNombre(); p.darCarta(this.mazo.proximaCarta()); }
		 */
	}

	public void agregarParticipante(Participante part) {
		this.participantes.add(part);
	}

	public int cantParticipantes() {
		return this.participantes.size();
	}

}
