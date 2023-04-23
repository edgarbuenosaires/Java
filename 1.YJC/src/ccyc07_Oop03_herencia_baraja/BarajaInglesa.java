package ccyc07_Oop03_herencia_baraja;

import java.util.ArrayList;

import ccyc07_Oop03_herencia_baraja_cartas.Carta;
import ccyc07_Oop03_herencia_baraja_cartas.CartaFigura;
import ccyc07_Oop03_herencia_baraja_cartas.CartaJocker;
import ccyc07_Oop03_herencia_baraja_cartas.CartaNumeral;

public class BarajaInglesa {

	private ArrayList<Carta> cartas;

	public BarajaInglesa() {
		super();
		this.cartas = new ArrayList<>();
		this.generarCarta();
	}

	public void mostrarBaraja() {
		for (Carta carta : cartas) {
			carta.darVuelta();
			carta.mostrar();
		}

	}

	private void generarCarta() {
		this.generarCartasNumerales();
		this.generarCartasFiguras();
		this.generarCartasJockers();

	}

	private void generarCartasNumerales() {
		final int MIN_VALOR = 2;
		final int MAX_VALOR = 10;
		Palo[] palos = Palo.values();

		for (int p = 0; p < palos.length; p++) {
			Palo paloActual = palos[p];

			for (int i = MIN_VALOR; i <= MAX_VALOR; i++) {
				this.cartas.add(new CartaNumeral(i, paloActual));
			}
		}
	}

	private void generarCartasFiguras() {
		char[] letras = { 'A', 'J', 'Q', 'K' };
		Palo[] palos = Palo.values();

		for (int p = 0; p < palos.length; p++) {
			Palo paloActual = palos[p];

			for (int i = 0; i < letras.length; i++) {
				char letraActual = letras[i];
				this.cartas.add(new CartaFigura(letraActual, paloActual));
			}
		}
	}

	private void generarCartasJockers() {
		this.cartas.add(new CartaJocker(true));
		this.cartas.add(new CartaJocker(false));
	}

}
