package ccyc09_Polimorfismo_EmpleadoSalario;

public class Principal {

	public static void main(String[] args) {
		Empresa emp = new Empresa();
		emp.agregarEmpleado(new EmpleadoSalarioFijo("123", "Ana", "Lopez", 2021, 45000));
		emp.agregarEmpleado(new EmpleadoAComision("123", "Pepe", "Gomezz", 2021, 30000, 100, 500));
		emp.agregarEmpleado(new EmpleadoSalarioFijo("123", "Luis", "Gomez", 2021, 50000));
		emp.agregarEmpleado(new EmpleadoAComision("123", "Leo", "Torres", 2017, 30000, 200, 100));
		emp.agregarEmpleado(new EmpleadoSalarioFijo("123", "Maria", "Perez", 2014, 10000));

		emp.mostrarSalarios();

		System.out.println("El empleado con mas clientes cap: " + emp.empleadoConMasClientes().nombreCompleto());
	}

}
