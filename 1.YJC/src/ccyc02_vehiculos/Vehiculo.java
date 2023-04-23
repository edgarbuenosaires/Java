package ccyc02_vehiculos;

public abstract class Vehiculo {
	private String marca;
	private String modelo;
	private String patente;

	public Vehiculo(String marca, String modelo, String patente) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.patente = patente;
	}

	public void acelerar() {
		System.out.println(marca);
		System.out.println("Acelerando...");
	}

	public void frenar() {
		System.out.println("Frenando");
	}

	public void encender() {
		chequeoMotor();
		System.out.println("Encendiendo");
	}

	private void chequeoMotor() {
		System.out.println("Chequeando motor...");

	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String nuevaMarca) {
		if (nuevaMarca != null) {
			this.marca = nuevaMarca;
		}
	}

	public String getModelo() {
		return modelo;
	}

	public String getPatente() {
		return patente;
	}

	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", patente=" + patente + "]";
	}

}
