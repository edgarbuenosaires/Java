package ccyc02_vehiculos;

//La palabra EXTENDS indica de que clase se esta herendando, en este caso de Vehiculo

public class Auto extends Vehiculo {
	private boolean tieneAire;

	public Auto(String marca, String modelo, String patente, boolean tieneAire) {
		// En el super se envian los argumentos soliicitados por la superclase.
		super(marca, modelo, patente);
		this.tieneAire = tieneAire;
	}

	public void prenderAire() {
		// System.out.println(marca);
		if (tieneAire) {
			System.out.println("Encendiendo Aire");
		}
	}
}
