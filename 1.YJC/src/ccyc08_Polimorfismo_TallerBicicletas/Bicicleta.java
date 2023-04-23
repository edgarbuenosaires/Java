package ccyc08_Polimorfismo_TallerBicicletas;

public class Bicicleta {

	private final int CANT_KMS_MAX = 50;
	private String marca;
	private int rodado;
	private int cantKms;

	public Bicicleta(String marca, int rodado, int cantKms) {
		super();
		this.marca = marca;
		this.rodado = rodado;
		this.cantKms = cantKms;
	}

	public boolean cumpleRequisito() {

		return this.cantKms < CANT_KMS_MAX;
	}

}
