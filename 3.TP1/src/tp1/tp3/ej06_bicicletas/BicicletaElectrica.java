package tp1.tp3.ej06_bicicletas;

public class BicicletaElectrica extends Bicicleta {
	private final static int MAX_POT = 250;
	private int potencia;

//	public boolean cumpleRequisitos() {
//		return this.potencia < MAX_POT;
//	}

	// Para el punto C

	public boolean cumpleRequisitos() {
		return super.cumpleRequisitos() && this.potencia < MAX_POT;
	}
}