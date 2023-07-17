package tp1.tp4.ej02_BarajaEspanola;

public enum Palo {
	ORO, BASTO, ESPADA, COPA;

	@Override
	public String toString() {
		String nom = name().toLowerCase();
		return nom.substring(0, 1).toUpperCase() + nom.substring(1);
	}
}
