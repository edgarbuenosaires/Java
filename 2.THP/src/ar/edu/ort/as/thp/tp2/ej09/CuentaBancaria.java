package ar.edu.ort.as.thp.tp2.ej09;

public class CuentaBancaria {
	private String cbu;
	private Tipo tipo;
	private double saldo;
	private Persona titular;

	// CONSTRUCTOR
	public CuentaBancaria(Tipo tipo, Persona titular) {
		this.cbu = generarCbu();
		this.tipo = tipo;
		this.saldo = 0;
		this.titular = titular;
	}

	// GETTERS & SETTERS

	private String generarCbu() {
		String cbu;
		int a = tipo.ordinal() + 10;
		// El DNI y el tipo, son parte del propio estado interno del objeto, no es necesiario pasarlo por parametros.
		cbu = String.valueOf(a) + "-" + titular.getDni() + "-" + titular.getDni().charAt(titular.getDni().length() - 1);
		return cbu;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public Persona getTitular() {
		return titular;
	}

	public void setTitular(Persona titular) {
		this.titular = titular;
	}

	public double obtenerSaldo() {
		return this.saldo;
	}

	public void depositar(double deposito) {
		this.saldo += deposito;
	}

	public boolean extraer(double monto) {
		boolean extraccionExitosa = false;
		if (this.obtenerSaldo() > monto) {
			this.saldo -= monto;
			extraccionExitosa = true;
		}
		return extraccionExitosa;
	}

	@Override
	public String toString() {
		return "Cuenta Bancaria Unica [" + cbu + "]\nTipo: " + this.getTipo();
	}

}
