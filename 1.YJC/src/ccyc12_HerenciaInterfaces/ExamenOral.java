package ccyc12_HerenciaInterfaces;

public class ExamenOral extends Examen {

	private NivelSatisfaccion nivelSatisfaccion;

	public ExamenOral(String fecha, NivelSatisfaccion nivelSatisfaccion) {
		super(fecha);
		this.nivelSatisfaccion = nivelSatisfaccion;
	}

	@Override
	public boolean aprobo() {
		return nivelSatisfaccion.ordinal() >= NivelSatisfaccion.SUFICIENTE.ordinal();
	}
}
