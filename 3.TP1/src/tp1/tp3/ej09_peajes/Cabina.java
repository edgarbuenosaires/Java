package tp1.tp3.ej09_peajes;

public class Cabina {
	private final int MIN_H_PICO1 = 6;
	private final int MAX_H_PICO1 = 10;
	private final int MIN_H_PICO2 = 17;
	private final int MAX_H_PICO2 = 20;
	private double INCR_H_PICO = 0.08;
	private String id;
	MedioDePago medioDePago;

	public double cobrar(Vehiculo v) {
		double importeFinal;

		importeFinal = v.getCategoria().getTarifa();
		if (abonaIncrementoHoraPIco()) {
			importeFinal = importeFinal * (1 + INCR_H_PICO);
		}
		importeFinal = importeFinal * (1 - this.medioDePago.getDescuento());
		return importeFinal;
	}

	private boolean abonaIncrementoHoraPIco() {
		int horaActual;

		horaActual = Estacion.dameHoraActual();
		return esHoraPico(horaActual);
	}

	private boolean esHoraPico(int h) {
		return (h >= MIN_H_PICO1 && h <= MAX_H_PICO1) || h >= MIN_H_PICO2 && h <= MAX_H_PICO2;
	}

	public boolean aceptaEfectivo() {
		return getMedioDePago() instanceof Efectivo;
	}

	public MedioDePago getMedioDePago() {
		return this.medioDePago;
	}

	public boolean aceptaMedioDePagoElectronico() {
		return getMedioDePago() instanceof MedioDePagoElectronico;
	}

	public String getId() {
		return id;
	}

}
