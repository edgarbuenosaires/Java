package tp1.parcial1.naves;

public class CargaAlimenticia extends Carga {
	private boolean esContaminante;
	private String alimento;
	private boolean esLiquido;

	public CargaAlimenticia(String descripcion, double volumen, String alimento, boolean esLiquido) {
		super(descripcion, volumen);
		this.esContaminante = false;
		this.alimento = alimento;
		this.esLiquido = esLiquido;
	}

	public boolean isEsContaminante() {
		return esContaminante;
	}

	
}
