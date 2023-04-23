package ccyc07_Oop03_herencia_baraja_cartas;

import ccyc07_Oop03_herencia_baraja.Palo;

public abstract class CartaConPalo extends Carta {

	private Palo palo;

	public CartaConPalo(Palo palo) {
		super();
		this.palo = palo;
	}

	public Palo getPalo() {
		return palo;
	}

	@Override
	public String getRepresentacion() {
		return " de " + palo;
	}

}
