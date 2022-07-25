package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class V33_Uso_Empleado {
	public static void main(String[] args) {

		/*
		 * Empleado empleado1 = new Empleado("Paco Gomez", 85000, 1990, 12, 17);
		 * Empleado empleado2 = new Empleado("Ana Lopezz", 95000, 1995, 6, 2); Empleado
		 * empleado3 = new Empleado("Maria Martin", 105000, 2003, 3, 15);
		 * empleado1.subeSueldo(5); empleado2.subeSueldo(3); empleado3.subeSueldo(2);
		 * System.out.println("Nombre: " + empleado1.dameNombre() + " Sueldo: " +
		 * empleado1.dameSueldo() + " Fecha de alta: " + empleado1.dameAltaContrato());
		 * System.out.println("Nombre: " + empleado2.dameNombre() + " Sueldo: " +
		 * empleado2.dameSueldo() + " Fecha de alta: " + empleado2.dameAltaContrato());
		 * System.out.println("Nombre: " + empleado3.dameNombre() + " Sueldo: " +
		 * empleado3.dameSueldo() + " Fecha de alta: " + empleado3.dameAltaContrato());
		 */

		Empleado[] misEmpleados = new Empleado[4];
		misEmpleados[0] = new Empleado("Paco Gomez", 85000, 1990, 12, 17);
		misEmpleados[1] = new Empleado("Ana Lopez", 95000, 1995, 6, 2);
		misEmpleados[2] = new Empleado("Maria Martin", 105000, 2003, 3, 15);
		misEmpleados[3] = new Empleado("Antonio Fernandez");

		for (int i = 0; i < misEmpleados.length; i++) {
			misEmpleados[i].subeSueldo(5);
		}

		for (Empleado e : misEmpleados) {
			System.out.println("Nombre: " + e.dameNombre() + " Sueldo: " + e.dameSueldo() + " Fecha de alta: "
					+ e.dameAltaContrato());
		}

	}
}

class Empleado {
	public Empleado(String nom, double sue, int ano, int mes,
			int dia) { /*
						 * El constructor siempre debe llevar el mismo nombre que la clase. No lleva
						 * void ni devuelve ningun tipo de dato.
						 */
		nombre = nom;
		sueldo = sue;
		GregorianCalendar calendario = new GregorianCalendar(ano, mes - 1, dia); // mes-1 porque Enero es "0"
		altaContrato = calendario.getTime();
	}

	public Empleado(String nom) {
		this(nom, 30000, 2000, 01, 01); /*
										 * El constructor solo recibe nombre, pero por defectocto coloca los demas
										 * valores.
										 */
	}

	public String dameNombre() { // GETTER
		return nombre;
	}

	public double dameSueldo() { // GETTER
		return sueldo;
	}

	public Date dameAltaContrato() { // GETTER
		return altaContrato;
	}

	public void subeSueldo(double porcent) { // SETTER
		double aumento = sueldo * porcent / 100;
		sueldo += aumento;
	}

	private String nombre;
	private double sueldo;
	private Date altaContrato;

}

class Jefatura extends Empleado {
	public Jefatura(String nom, double sue, int agno, int mes, int dia) {
		super(nom, sue, agno, mes, dia);
	}

	public void estableceIncentivo(double b) {
		incentivo = b;
	}

	public double dameSueldo() {
		double sueldoJefe = super.dameSueldo();
		return sueldoJefe + incentivo;
	}

	private double incentivo;

}
