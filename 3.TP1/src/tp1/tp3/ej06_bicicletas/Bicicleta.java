package tp1.tp3.ej06_bicicletas;

public class Bicicleta {
	private static final int MAX_KMS = 2000;
	private String marca;
	private String modelo;
	private int cantKm;

	public boolean cumpleRequisitos() {
		return this.cantKm < MAX_KMS;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

}