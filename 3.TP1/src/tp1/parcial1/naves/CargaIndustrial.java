package tp1.parcial1.naves;

public class CargaIndustrial extends Carga {
	private boolean esContaminante;
	private boolean esRadiactivo;
	private String industria;

	public CargaIndustrial(String descripcion, double volumen, boolean esRadiactivo,
			String industria) {
		super(descripcion, volumen);
		this.esContaminante = esRadiactivo;
		this.esRadiactivo = esRadiactivo;
		this.industria = industria;
	}

	public boolean isEsContaminante() {
		return esContaminante;
	}

}
