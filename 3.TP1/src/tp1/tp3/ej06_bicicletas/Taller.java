package tp1.tp3.ej06_bicicletas;

import java.util.ArrayList;

public class Taller {

	public int cantServiciosPosibles(ArrayList<Bicicleta> bicicletas) {
		int cont = 0;
		for (Bicicleta b : bicicletas) {
			if (b.cumpleRequisitos()) {
				cont++;
			}
		}
		return cont;
	}	
}
