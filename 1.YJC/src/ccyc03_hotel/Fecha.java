package ccyc03_hotel;

public class Fecha {
	private int dia;
	private int mes;
	private int anio;

	public String obtenerComoCadena() {
		return this.dia + "/" + this.mes + "/" + this.anio;
	}
}
