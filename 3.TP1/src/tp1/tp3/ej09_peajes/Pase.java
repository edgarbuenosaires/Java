package tp1.tp3.ej09_peajes;

public class Pase extends MedioDePagoElectronico {

	private final double DCTO = 0.15;
	private final int DEMORA_ESP = 5;
	private final double DCTO_POR_DEM_ESP = 0.12;

	@Override
	public double getDescuento() {
		double dcto;
		
		if (getDiasDemora() < DEMORA_ESP) {
			dcto = DCTO;
		} else {
			dcto = DCTO_POR_DEM_ESP;
		}
		return dcto;
	}

}
