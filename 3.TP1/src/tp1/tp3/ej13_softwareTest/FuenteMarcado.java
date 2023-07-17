package tp1.tp3.ej13_softwareTest;

public class FuenteMarcado extends Fuente {
	public static final int MARCADO_DIVISION = 450;
	private double tamanioArchivoKB;
	private TipoMarcado tipo;

	@Override
	public double indiceCalidad() {
		return MARCADO_DIVISION / tamanioArchivoKB;
	}

}
