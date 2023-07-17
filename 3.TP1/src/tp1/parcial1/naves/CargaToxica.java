package tp1.parcial1.naves;

public class CargaToxica extends Carga {
	private boolean contaminante;
	private String material;

	public CargaToxica(String descripcion, double volumen, String material) {
		super(descripcion, volumen);
		this.contaminante = true;
		this.material = material;
	}

	@Override
	public boolean isEsContaminante() {
		// TODO Auto-generated method stub
		return contaminante;
	}

}
