package ccyc08_Polimorfismo_TallerBicicletas;

import java.util.ArrayList;

public class Taller {
	public int cantServiciosPosibles(ArrayList<Bicicleta> bicis) {
		int contador = 0;
		for (Bicicleta bici : bicis) {
			if (bici.cumpleRequisito()) {
				contador++;
			}
		}
		return contador;
	}
}
