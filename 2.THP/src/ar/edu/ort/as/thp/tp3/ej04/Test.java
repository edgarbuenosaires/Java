package ar.edu.ort.as.thp.tp3.ej04;

public class Test {

	public static void main(String[] args) {
		Duenio duenio1 = new Duenio("Juan");
		Duenio duenio2 = new Duenio("Fulano");

		Perro perro1 = new Perro("Pichichus");
		Perro perro2 = new Perro("Sultan");
		Perro perro3 = new Perro("Bobby");
		Perro perro4 = new Perro("Firulais");
		Perro perro5 = new Perro("Rocco");

		Collar collar1 = new Collar("Pichichus");
		Collar collar2 = new Collar("Sultan");
		Collar collar3 = new Collar("Bobby");
		Collar collar4 = new Collar("Firulais");

		Perchero perchero1 = new Perchero();
		Perchero perchero2 = new Perchero();

		duenio1.setPerchero(perchero1);
		duenio2.setPerchero(perchero2);

		duenio1.agregarPerro(perro1);
		duenio1.agregarPerro(perro2);
		duenio1.agregarPerro(perro3);

		duenio2.agregarPerro(perro4);
		duenio2.agregarPerro(perro5);

		perchero1.agregarCollar(collar1);
		perchero1.agregarCollar(collar2);
		perchero1.agregarCollar(collar3);

		perchero2.agregarCollar(collar4);

		System.out.println("Duenio 1:");
		System.out.println(duenio1);

		System.out.println();

		System.out.println("Duenio 2:");
		System.out.println(duenio2);

	}

}
