package ccyc12_HerenciaInterfaces;

import java.util.ArrayList;

public class CentroEducativo {
	private ArrayList<Alumno> alumnos;

	public CentroEducativo() {
		this.alumnos = new ArrayList<>();
	}

	public void agregarAlumno(Alumno a) {
		this.alumnos.add(a);
	}

	public int cantAprobados() {
		int cant = 0;
		for (Alumno a : alumnos) {
			if (a.aprobo()) {
				cant++;
			}
		}
		return cant;
	}




}
