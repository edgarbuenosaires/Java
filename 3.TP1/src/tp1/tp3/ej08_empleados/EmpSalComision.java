package tp1.tp3.ej08_empleados;

public class EmpSalComision extends Empleado {

	private final static double SALARIO_MIN = 20000;
	private int nroClientCaptads;
	private double montPorClientCaptado;

	public EmpSalComision(String dni, String nombre, String apellido, int anioIngreso, int nroClientCaptads,
			double montPorClientCaptado) {
		super(dni, nombre, apellido, anioIngreso);
		this.nroClientCaptads = nroClientCaptads;
		this.montPorClientCaptado = montPorClientCaptado;
	}

	@Override
	public double getSalario() {
		double monto = (this.salarioPorClientes() > SALARIO_MIN) ? salarioPorClientes() : SALARIO_MIN;
		return monto;
	}

	private double salarioPorClientes() {
		return this.nroClientCaptads * montPorClientCaptado;
	}

	public int getCatClientes() {
		return this.nroClientCaptads;
	}

	@Override
	public String toString() {
		return "EmpSalComision [nroClientCaptads=" + nroClientCaptads + ", montPorClientCaptado=" + montPorClientCaptado
				+ "]";
	}
	
}
