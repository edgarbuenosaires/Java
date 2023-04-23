package tp1.parcial1.licencDeConducir;

public class Moto extends Vehiculo {
	private boolean llevaEspejos;

	public Moto(String patente, String marca, int cilindrada, boolean llevaEspejos) {
		super(patente, marca, cilindrada);
		this.llevaEspejos = llevaEspejos;
	}

}
