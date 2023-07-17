package tp1.tp3.ej08_empleados;

public class EmpSalFijo extends Empleado {

	private double sueldoBasico;

	public EmpSalFijo(String dni, String nombre, String apellido, int anioIngreso, double sueldoBasico) {
		super(dni, nombre, apellido, anioIngreso);
		this.sueldoBasico = sueldoBasico;

	}

	@Override
	public double getSalario() {
		return this.sueldoBasico + adicionalPorAnti();
	}

	private double adicionalPorAnti() {
		return this.sueldoBasico * this.porcentajeAdicional();
	}

	private double porcentajeAdicional() {
		double porcAdic;
		
		if (super.getAniosDeAntiguedad() < 2) {
			porcAdic = 0;
		} else if (super.getAniosDeAntiguedad() <= 5) {
			porcAdic = 0.05;
		} else if (super.getAniosDeAntiguedad() <= 10) {
			porcAdic = 0.10;
		} else {
			porcAdic = 0.15;
		}
		return porcAdic;
	}

}
