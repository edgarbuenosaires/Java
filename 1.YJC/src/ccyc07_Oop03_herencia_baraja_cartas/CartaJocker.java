package ccyc07_Oop03_herencia_baraja_cartas;

public class CartaJocker extends Carta {
	private boolean aColor;

	public CartaJocker(boolean aColor) {
		super();
		this.aColor = aColor;
	}

@Override
	public String getRepresentacion() {

		return "JOCKER " + (aColor ? "a color" : "blanco y negro");
	}
}
