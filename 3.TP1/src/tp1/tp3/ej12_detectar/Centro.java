package tp1.tp3.ej12_detectar;

import java.util.ArrayList;

public class Centro {
	private static final int CAPACIDAD = 50;
	private ArrayList<Dia> dias;

	public Centro() {
		super();
		this.dias = new ArrayList<>();
	}

	public double resvisar() {
		int acuAfuera = 0;
		int totalPersonas = 0;

		for (Dia d : dias) {
			acuAfuera += d.revisar(CAPACIDAD);
			totalPersonas += d.getCantPersonas();
		}
		return (acuAfuera / totalPersonas) * 100;
	}

	public void mostrarDiaConMasPrioritarios() {
		int max = -1;
		Dia diaMax = null;

		for (Dia d : dias) {
			int cantP = d.cantPersonasPorPrioridad(Priorizable.PRIORIDAD_MAX);
			if (cantP > max) {
				max = cantP;
				diaMax = d;
			}
		}
		if (diaMax != null) {
			System.out.println(diaMax.getFecha() + ": " + max + " personas.");

		}

	}

}
