package ccyc09_Polimorfismo_EmpleadoSalario;

import java.util.ArrayList;

public class Empresa {
	private ArrayList<Empleado> empleados;

	public Empresa() {
		super();
		this.empleados = new ArrayList<Empleado>();
	}

	public void agregarEmpleado(Empleado emp) {
		this.empleados.add(emp);
	}

	public void mostrarSalarios() {
		for (Empleado emp : empleados) {
			System.out.println(emp.nombreCompleto() + ": $" + emp.getSalario());
		}

	}

	public Empleado empleadoConMasClientes() {
		int max = -1;
		Empleado elMayor = null;
		for (Empleado emp : empleados) {
			if (emp instanceof EmpleadoAComision) {
				EmpleadoAComision eac = (EmpleadoAComision) emp;
				int cant = eac.getCantClientesCaptados();
				if (cant > max) {
					max = cant;
					elMayor = emp;
				}
			}
		}
		return elMayor;
	}

}
