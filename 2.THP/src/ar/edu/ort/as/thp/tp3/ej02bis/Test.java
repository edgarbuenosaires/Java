package ar.edu.ort.as.thp.tp3.ej02bis;

public class Test {
	public static void main(String[] args) {

		Compania comp = new Compania("Monster Inc.");

		Area area1 = new Area("Contaduria");
		Area area2 = new Area("Ventas");

		Oficina ofi1 = new Oficina("Oficina A");
		Oficina ofi2 = new Oficina("Oficina B");
		Oficina ofi3 = new Oficina("Oficina C");
		Oficina ofi4 = new Oficina("Oficina D");

		Empleado emp1 = new Empleado("Jose Perez");
		Empleado emp2 = new Empleado("Pepe Perez");
		Empleado emp3 = new Empleado("Neuricio Perez");
		Empleado emp4 = new Empleado("Hanibal Perez");
		Empleado emp5 = new Empleado("Patricio Perez");
		Empleado emp6 = new Empleado("Bob Perez");
		Empleado emp7 = new Empleado("Don Rata Perez");
		Empleado emp8 = new Empleado("Raul Perez");
		Empleado emp9 = new Empleado("Leo Perez");
		Empleado emp10 = new Empleado("Nicanor Perez");

		comp.agregarArea(area1);
		comp.agregarArea(area2);
		
		area1.agregarOficina(ofi1);
		area1.agregarOficina(ofi2);
		
		area2.agregarOficina(ofi3);
		area2.agregarOficina(ofi4);
		
		ofi1.agregarEmpleado(emp1);
		ofi1.agregarEmpleado(emp2);
		ofi2.agregarEmpleado(emp3);
		ofi2.agregarEmpleado(emp9);
		ofi2.agregarEmpleado(emp4);
		ofi3.agregarEmpleado(emp5);
		ofi3.agregarEmpleado(emp6);
		ofi4.agregarEmpleado(emp7);
		ofi4.agregarEmpleado(emp10);
		ofi4.agregarEmpleado(emp8);
		
		comp.agregarEmpleado("El agregado", area2, ofi3);
		
		comp.mostrarCompania();
		
	}
}
