package ccyc08_Polimorfismo_TallerBicicletas;

public class BicicletaElectrica extends Bicicleta {

	private final int CANT_POT__MAX = 400;
	private int potencia;

	public BicicletaElectrica(String marca, int rodado, int cantKms, int potencia) {
		super(marca, rodado, cantKms);
		this.potencia = potencia;
	}

	public boolean cumpleRequisito() {
		// El super.cumpleRequisitos hace referencia a la logica del metodo cumpleRequisitos de la super clase.
		return this.potencia < CANT_POT__MAX && super.cumpleRequisito();
	}

}
