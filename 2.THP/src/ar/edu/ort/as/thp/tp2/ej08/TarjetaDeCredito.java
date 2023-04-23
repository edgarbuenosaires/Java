package ar.edu.ort.as.thp.tp2.ej08;

public class TarjetaDeCredito {

	private String numero;
	private String titular;
	private double limiteDeCompra;
	private double acumuladoActual;

	// ------- Constructor: -------

	public TarjetaDeCredito(String numero, String titular, double limiteDeCompra) {
		this.setNumero(numero);
		this.setTitular(titular);
		this.setlimiteDeCompra(limiteDeCompra);
		this.acumuladoActual = 0;
	}

	// ------- Setters and Getters -------

	public String getNumero() {
		return this.numero;
	}

	private void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return this.titular;
	}

	private void setTitular(String titular) {
		this.titular = titular;
	}

	public double getLimiteDeCompra() {
		return this.limiteDeCompra;
	}

	private void setlimiteDeCompra(double limiteDeCompra) {
		if (limiteDeCompra >= 0) {
			this.limiteDeCompra = limiteDeCompra;
		}
	}

	public double getAcumuladoActual() {
		return this.acumuladoActual;
	}

	// ------- Otros Metodos: -------

	public double montoDisponible() {
		double disponible;
		disponible = this.getLimiteDeCompra() - this.getAcumuladoActual();
		if (disponible < 0) {
			disponible = 0;
		}
		return disponible;
	}

	private boolean compraPosible(double compra) {

		return compra <= this.montoDisponible();
	}

	public void actualizarLimite(double limite) {
		this.setlimiteDeCompra(limite);
	}

	private void acumularGastoActual(double gasto) {
		this.acumuladoActual += gasto;
	}

	public boolean realizarCompra(double compra) {
		boolean compraPosible;
		if (compraPosible(compra)) {
			acumularGastoActual(compra);
			compraPosible = true;
		} else {
			compraPosible = false;
		}
		return compraPosible;
	}

	@Override
	public String toString() {
		return "TARJETA DE CREDITO:\nNum:" + numero + ",\nTitular: " + titular + ",\nLimite De Compra: "
				+ limiteDeCompra + ",\nAcumulado Actual: " + acumuladoActual + "\nSaldo Disponible: "
				+ montoDisponible();
	}

}
