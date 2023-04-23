package ar.edu.ort.as.thp.tp2.ej02_03_04_05;

public class Domicilio {
	private String calle;
	private int numero;
	private String ciudad;

	public Domicilio() {
		this.calle = "";
		this.numero = 0;
		this.ciudad = "";
	}

	public Domicilio(String calle, int numero, String ciudad) {
		this.setCalle(calle);
		this.setNumero(numero);
		this.setCiudad(ciudad);
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public void mostrar() {
		// hace lo mismo el que el toString()
		System.out.println(this.getCalle() + " " + this.getNumero() + " - " + this.getCiudad());
	}

	public String toString() {
		return "Domicilio [calle=" + calle + ", numero=" + numero + ", ciudad=" + ciudad + "]";
	}

}
