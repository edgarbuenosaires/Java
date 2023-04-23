package tp1.tp3.ej08_empleados;

import java.time.LocalDate;

public abstract class Empleado {
	private String dni;
	private String nombre;
	private String apellido;
	private int anioIngreso;

	public Empleado(String dni, String nombre, String apellido, int anioIngreso) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.anioIngreso = anioIngreso;
	}

	public abstract double getSalario();

	public void mostrarDatos() {
		System.out.println(nombreCompleto() + " $" + getSalario());
	}

	private String nombreCompleto() {
		return this.nombre + " " + this.apellido;
	}

	public int getAniosDeAntiguedad() {
		return LocalDate.now().getYear() - this.anioIngreso;
	}

	public int getClientes() {
		int clientes = 0;
		if (this instanceof EmpSalComision) {
			EmpSalComision emp = (EmpSalComision) this;
			clientes = emp.getClientes();
		}
		return clientes;
	}

	public String getDNI() {
		return dni;
	}

}