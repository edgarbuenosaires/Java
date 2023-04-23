package tp1.tp3.ej08_empleados;

import java.util.ArrayList;

public class Empresa {
	private String nombre;
	private ArrayList<Empleado> empleados;

	public Empresa(String nom) {
		super();
		this.empleados = new ArrayList<>();
		this.nombre = nom;
	}

	public void agregarEmpleado(Empleado e) {
		if (e != null) {
			empleados.add(e);
		}
	}

	public void mostrarSalarios() {
		for (Empleado e : empleados) {
			e.mostrarDatos();
		}
	}

	public Empleado empleadoConMasClientes() {

		Empleado empConMasClientes = null;
		int maxClientes = -1;
		int cantCli;

		for (Empleado e : empleados) {
			if (e instanceof EmpSalComision) {
				EmpSalComision ec = (EmpSalComision) e;
				cantCli = ec.getCatClientes();
				if (cantCli > maxClientes) {
					maxClientes = cantCli;
					empConMasClientes = ec;
				}
			}
		}
		return empConMasClientes;
	}

	public String getNombre() {
		return nombre;
	}

	public void muestroEmpleadoConMasClientes() {
		Empleado e = this.empleadoConMasClientes();
		if (e != null) {
			e.mostrarDatos();
		}else {
			System.out.println("No hay empleados con clientes cautivos.");
		}
	
		
	}

	

}
