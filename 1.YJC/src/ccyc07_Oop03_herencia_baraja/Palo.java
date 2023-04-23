package ccyc07_Oop03_herencia_baraja;

public enum Palo {
	DIAMANTE(Color.ROJO), CORAZON(Color.ROJO), PICA(Color.NEGRO), TREBOL(Color.NEGRO);

	private Color color; // Cada palo va a llevar un color asociado

	Palo(Color co) {
		this.color = co;
	}

	public Color getColor() {
		return color;
	}

}
