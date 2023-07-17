package tp1.tp3.ej10_puerto;

public class Amarra {
	private int nro;
	private String ubicacion;
	private Embarcacion elBarco;

	public boolean estaDisponible() {
		return this.elBarco == null;
	}

	public double getnMontoAlquiler() {
		double monto = 0;

		if (!estaDisponible()) {
			monto = elBarco.montoAlquiler();
		}
		return monto;
	}

	public Embarcacion getElBarco() {
		return elBarco;
	}

	public boolean amarrar(Embarcacion emb) {
		boolean sePudo = false;

		if (estaDisponible()) {
			this.elBarco = emb;
			sePudo = true;
		}
		return sePudo;
	}

	@Override
	public String toString() {
		return "Amarra [nro=" + nro + ", ubicacion=" + ubicacion + ", elBarco=" + elBarco + "]";
	}
	
	

}
