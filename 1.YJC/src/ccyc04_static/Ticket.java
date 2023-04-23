package ccyc04_static;

public class Ticket {
	private static int contador = 0;
	private int numero;
	private String fechaCompra;
	private String DNIPersona;

	public Ticket(String fechaCompra, String dNIPersona) {
		contador++;
		this.numero = contador;
		this.fechaCompra = fechaCompra;
		DNIPersona = dNIPersona;
	}

	@Override
	public String toString() {
		return "Ticket [numero=" + numero + ", fechaCompra=" + fechaCompra + ", DNIPersona=" + DNIPersona + "]";
	}

}
