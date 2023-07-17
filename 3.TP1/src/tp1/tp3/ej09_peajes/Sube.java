package tp1.tp3.ej09_peajes;

public class Sube extends MedioDePagoElectronico {
	private final double DCTO = 0.1;

	@Override
	public double getDescuento() {
		return DCTO;
	}
}
