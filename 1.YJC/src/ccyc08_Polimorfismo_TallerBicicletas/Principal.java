package ccyc08_Polimorfismo_TallerBicicletas;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		ArrayList<Bicicleta> bicis = new ArrayList<>();

		bicis.add(new Bicicleta("Fake", 20, 30));
		bicis.add(new BicicletaElectrica("BiciE", 16, 65, 250));
		bicis.add(new Bicicleta("UltraBike", 28, 55));
		bicis.add(new BicicletaElectrica("Elecleta", 18, 43, 350));

		Taller t = new Taller();

		System.out.println("Servicios posibles: " + t.cantServiciosPosibles(bicis));
	}

}
