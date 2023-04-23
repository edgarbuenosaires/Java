package ar.edu.ort.as.thp.parcial_2;

public class Test {

	public static void main(String[] args) {
		Alumno alu1 = new Alumno(111, false, 10);
		Alumno alu2 = new Alumno(112, false, 0);
		Alumno alu3 = new Alumno(113, false, 5);
		Alumno alu4 = new Alumno(114, false, 10);
		Alumno alu5 = new Alumno(115, false, 2);
		Alumno alu6 = new Alumno(116, false, 2);
		Alumno alu7 = new Alumno(117, false, 8);
		Alumno alu8 = new Alumno(118, false, 6);
		Alumno alu9 = new Alumno(119, false, 2);
		Alumno alu10 = new Alumno(110, false, 7);
		Alumno alu11 = new Alumno(111, false, 9);
		
		Materia fp = new Materia("Fundamentos de Programacion");
		
		fp.agregarAlumno(alu1);
		fp.agregarAlumno(alu2);
		fp.agregarAlumno(alu3);
		fp.agregarAlumno(alu4);
		fp.agregarAlumno(alu5);
		fp.agregarAlumno(alu6);
		fp.agregarAlumno(alu7);
		fp.agregarAlumno(alu8);
		fp.agregarAlumno(alu9);
		fp.agregarAlumno(alu10);
		fp.agregarAlumno(alu11);
		
		fp.generarActas();
		
		fp.emitirResumen();
		
		System.out.println("---------- cambio nota ----------");
		System.out.println(fp.actualizarNota(117, 2));
		System.out.println(fp.actualizarNota(114, 5));
		fp.emitirResumen();
		

	}

}
