package tp1.tp3.ej08_empleados;

public class Principal {

	public static void main(String[] args) {
		Empresa e = new Empresa("Juanito");

		e.agregarEmpleado(new EmpSalFijo("1234", "Leonel", "Messi", 2010, 20000));
		e.agregarEmpleado(new EmpSalFijo("1234", "Jose", "Quiroga", 2000, 30000));
		e.agregarEmpleado(new EmpSalFijo("1234", "Juan", "Perez", 2015, 40000));
		e.agregarEmpleado(new EmpSalFijo("1234", "Juana", "Gonzales", 2010, 50000));

		e.agregarEmpleado(new EmpSalComision("3456", "Juaquin", "Garcia", 2005, 30, 350));
		e.agregarEmpleado(new EmpSalComision("3456", "Maria", "Perez", 2018, 50, 350));
		e.agregarEmpleado(new EmpSalComision("3456", "Julieta", "Lopez", 2017, 10, 350));
		e.agregarEmpleado(new EmpSalComision("3456", "Enrique", "Stansich", 2002, 00, 350));
		e.agregarEmpleado(new EmpSalComision("3456", "Gonzalo", "Smith", 2020, 30, 350));

		e.mostrarSalarios();
		System.out.println();

		System.out.println("El empleado con mas clientes es: ");
		e.muestroEmpleadoConMasClientes();
	}
}
