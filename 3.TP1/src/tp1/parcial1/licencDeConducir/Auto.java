package tp1.parcial1.licencDeConducir;

public class Auto extends Vehiculo {
	private int cantPurtas;

	public Auto(String patente, String marca, int cilindrada, int cantPurtas) {
		super(patente, marca, cilindrada);
		this.cantPurtas = cantPurtas;
	}
}
