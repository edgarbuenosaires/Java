package ccyc09_Polimorfismo_EmpleadoSalario;

public class EmpleadoAComision extends Empleado {

	private double salarioMinimo;
	private int cantClientesCaptados;
	private double montoPorCliente;

	public EmpleadoAComision(String dni, String nombre, String apellido, int anioIngreso, double salarioMinimo,
			int cantClientesCaptados, double montoPorCliente) {
		super(dni, nombre, apellido, anioIngreso);
		this.salarioMinimo = salarioMinimo;
		this.cantClientesCaptados = cantClientesCaptados;
		this.montoPorCliente = montoPorCliente;
	}

	@Override
	public double getSalario() {
		double sal = this.montoPorCliente * this.cantClientesCaptados;
		if (sal < this.salarioMinimo) {
			sal = this.salarioMinimo;
		}
		return sal;
	}

	public int getCantClientesCaptados() {
		return cantClientesCaptados;
	}

	
	
	

}
