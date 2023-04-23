package tp1.tp1.ej10;

import java.util.ArrayList;

public class Mazo {

	private ArrayList<Carta> cartas;

	public Mazo() {
		super();
		this.cartas = new ArrayList<>();
	}

	public int cantCartas() {
		return this.cartas.size();
	}

	public Carta proximaCarta() {
		return this.cartas.remove(0);
	}
}
