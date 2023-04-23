package ccyc09_Polimorfismo_EmpleadoSalario;

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

	public String nombreCompleto() {
		return this.nombre + " " + this.apellido;

	}

	public int antiguedadEnAnios() {
		int anioActual = LocalDate.now().getYear();
		return anioActual - anioIngreso;
	}

	public abstract double getSalario();


	
	
}
