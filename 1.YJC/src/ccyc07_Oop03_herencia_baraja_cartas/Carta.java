package ccyc07_Oop03_herencia_baraja_cartas;

public abstract class Carta {
	private boolean tapada;

	public Carta() {
		super();
		this.tapada = true;
	}

	public void darVuelta() {
		// foma para dar vuelta un booleano
		tapada = !tapada;
	}

	public void mostrar() {
		if (tapada) {
			System.out.println("*******");
		} else {
			System.out.println(getRepresentacion());
		}
	}

	// Al hacer este metodo abstracto, estamos obligando a las sublases a
	// reescribirlo.
	public abstract String getRepresentacion();

	public boolean isTapada() {
		return tapada;
	}

}
