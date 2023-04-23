package ccyc07_Oop03_herencia_baraja_cartas;

import ccyc07_Oop03_herencia_baraja.Palo;

public class CartaNumeral extends CartaConPalo {

	private int numero;

	public CartaNumeral(int numero, Palo palo) {
		super(palo);
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public String getRepresentacion() {

		return this.numero + super.getRepresentacion();
	}
}
