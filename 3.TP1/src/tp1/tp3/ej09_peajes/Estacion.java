package tp1.tp3.ej09_peajes;

import java.util.ArrayList;

public class Estacion {
	private String ID;
	private String descripcion;
	private ArrayList<Cabina> cabinas;

	public Estacion(String iD, String descripcion) {
		super();
		ID = iD;
		this.descripcion = descripcion;
		this.cabinas = new ArrayList<>();
	}

	public static int dameHoraActual() {
		return 0;
	}

	public ArrayList<Cabina> cabinasConEfectivo() {
		ArrayList<Cabina> cabinasConEfect = new ArrayList<>();

		for (Cabina c : cabinas) {
			if (c.aceptaEfectivo()) {
				cabinasConEfect.add(c);
			}
		}
		return cabinasConEfect;
	}

	public double promedioDemora() {
		double acu = 0;
		int cont = 0;
		double promedio = 0;

		for (Cabina c : cabinas) {
			if (c.aceptaMedioDePagoElectronico()) {
				MedioDePagoElectronico mdpe = (MedioDePagoElectronico) c.getMedioDePago();
				acu += mdpe.getDiasDemora();
				cont++;
			}
		}
		if (cont > 0) {
			promedio = acu / cont;
		}
		return promedio;
	}

	public String getID() {
		return ID;
	}

	public String getDescripcion() {
		return descripcion;
	}

}
