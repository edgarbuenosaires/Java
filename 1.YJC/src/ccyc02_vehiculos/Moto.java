package ccyc02_vehiculos;

// La palabra EXTENDS indica de que clase se esta herendando, en este caso de Vehiculo

public class Moto extends Vehiculo {
	private int anchoDeManubrio;

	public Moto(String marca, String modelo, String patente, int anchoDeManubrio) {
		// En el super se envian los argumentos del constructor de la superclase.
		super(marca, modelo, patente);
		this.anchoDeManubrio = anchoDeManubrio;
	}

	void hacerWheelie() {
		System.out.println("Haciendo Wheelie");
	}

	public int getAnchoDeManubrio() {
		return anchoDeManubrio;
	}

}
