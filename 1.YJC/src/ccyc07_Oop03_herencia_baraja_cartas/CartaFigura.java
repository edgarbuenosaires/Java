package ccyc07_Oop03_herencia_baraja_cartas;

import ccyc07_Oop03_herencia_baraja.Palo;

public class CartaFigura extends CartaConPalo {

	private char letra;

	public CartaFigura(char letra, Palo palo) {
		super(palo);
		this.letra = letra;
	}

	public char getLetra() {
		return letra;
	}

	public String getRepresentacion() {

		return this.letra + super.getRepresentacion();
	}
}
