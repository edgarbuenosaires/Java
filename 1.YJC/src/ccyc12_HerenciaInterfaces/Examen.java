package ccyc12_HerenciaInterfaces;

public abstract class Examen implements Aprobable {
	private String fecha;

	public Examen(String fecha) {
		super();
		this.fecha = fecha;
	}

	@Override
	public boolean aprobo() {
		// TODO Auto-generated method stub
		return false;
	}

}
