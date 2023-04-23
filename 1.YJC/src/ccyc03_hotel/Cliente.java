package ccyc03_hotel;

public class Cliente {
	private String DNI;
	private String nombre;
	private String apellido;

	public String nombreCompleto() {
		return this.nombre + " " + this.apellido;
	}

	public String getDni() {
		return this.DNI;
	}
}
