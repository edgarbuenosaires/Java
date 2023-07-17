package tp1.tp4.ej08_asientosDeAvion;

public class Asiento {
	private int numero;
	private Estado estado;

	public void reservar() {
		this.estado = Estado.RESERVADD;
	}

	public Estado getEstado() {
		return this.estado;
	}
}
