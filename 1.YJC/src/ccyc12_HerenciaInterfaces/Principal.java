package ccyc12_HerenciaInterfaces;

public class Principal {
	public static void main(String[] args) {
		CentroEducativo ce = new CentroEducativo();

		Alumno pepe = new Alumno("1234", "Pepin", "Pepe");
		Alumno maria = new Alumno("1234", "Mengajo", "Maria");
		Alumno luis = new Alumno("4567", "Sultano", "Luis");

		pepe.agregarExamen(new ExamenEscrito("00/00/0000", 40, 7));
		pepe.agregarExamen(new ExamenOral("00/00/0000", NivelSatisfaccion.SUFICIENTE));

		maria.agregarExamen(new ExamenEscrito("00/00/0000", 60, 4));
		maria.agregarExamen(new ExamenEscrito("00/00/0000", 65, 8));
		maria.agregarExamen(new ExamenOral("00/00/0000", NivelSatisfaccion.EXCELENTE));

		luis.agregarExamen(new ExamenEscrito("00/00/0000", 100, 9));
		luis.agregarExamen(new ExamenOral("00/00/0000", NivelSatisfaccion.INSUFICIENTE));
		luis.agregarExamen(new ExamenOral("00/00/0000", NivelSatisfaccion.EXCELENTE));

		ce.agregarAlumno(pepe);
		ce.agregarAlumno(maria);
		ce.agregarAlumno(luis);

		System.out.println("Cantidad de Aprobados: " + ce.cantAprobados());
	}
}
