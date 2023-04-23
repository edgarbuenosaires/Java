package ar.edu.ort.as.thp.tp3.ej01;

public class Domicilio {
	private String calle;
	private String numero;
	private String ciudad;

	
	public Domicilio(String calle, String numero, String ciudad) {
		super();
		this.calle = calle;
		this.numero = numero;
		this.ciudad = ciudad;
	}


	@Override
	public String toString() {
		return calle + " " + numero + " - " + ciudad;
	}

}
