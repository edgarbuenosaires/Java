package ccyc02_herencia;

import ccyc02_vehiculos.Auto;
import ccyc02_vehiculos.Moto;
import ccyc02_vehiculos.Vehiculo;

public class Principal {

	public static void main(String[] args) {
		Auto a = new Auto("Peugeot", "207", "ABC1", true);
		a.acelerar();
		System.out.println(a);

		Moto m = new Moto("Honda", "CB500", "GHT45", 80);
		// m.hacerWheelie();
		m.getMarca();
		// System.out.println(a.marca);

		// UPCASTING

		// Vehiculo v = new Vehiculo("Honda", "CB305", "X2h98");
		// Al ser vehiculo una clase abstracta se deja de instanciar vehiculos.
		Moto j = new Moto("Yamaha", "Y700", "M346F", 78);

		Vehiculo n = new Auto("Ford", "KA", "D234K", true);
		Vehiculo f = j;

		// DOWNCASTING
		Auto a2 = (Auto) n; // se puede porque en n habia un auto
		System.out.println(a2);

		// Auto a3 = (Auto) f; // no se puede porque en f habia una moto

		// Chequeando que f sea una instancia de Auto, podemos proceder a castearlo
		if (f instanceof Auto) {
			Auto a3 = (Auto) f;
			System.out.println(a3);
		}

	}

}
