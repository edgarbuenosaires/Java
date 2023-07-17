package tp1.tp3.ej06_bicicletas;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		ArrayList<Bicicleta> bicicletas = new ArrayList<>();

		Bicicleta bici1 = new Bicicleta("Pepe", "TK34", 300);
		Bicicleta bici2 = new Bicicleta("Pepito", "H455", 1800);
		Bicicleta bici3 = new Bicicleta("Potito", "WW94", 2001);
		Bicicleta bici4 = new Bicicleta("BTM", "938", 40);

		BicicletaElectrica biciEle5 = new BicicletaElectrica("Electrondo", "Edesur", 1500, 240);
		BicicletaElectrica biciEle6 = new BicicletaElectrica("La Electrica", "Edenor", 2200, 240);
		BicicletaElectrica biciEle7 = new BicicletaElectrica("Electrondo", "La sin Lu", 1000, 200);
		BicicletaElectrica biciEle8 = new BicicletaElectrica("Pepito Corriente", "982", 2020, 240);

		bicicletas.add(bici1);
		bicicletas.add(bici2);
		bicicletas.add(bici3);
		bicicletas.add(bici4);
		bicicletas.add(biciEle5);
		bicicletas.add(biciEle6);
		bicicletas.add(biciEle7);
		bicicletas.add(biciEle8);

		Taller t = new Taller("BiciMundo");

		System.out.println(t.cantServiciosPosibles(bicicletas));
		;

	}

}
