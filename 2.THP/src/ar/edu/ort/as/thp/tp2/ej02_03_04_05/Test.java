package ar.edu.ort.as.thp.tp2.ej02_03_04_05;

public class Test {

	public static void main(String[] args) {
		Persona per1;
		Persona per2;
		Persona per3;

		per1 = new Persona();
		per2 = new Persona();

		per1.ponerNombre("Fulano");
		per1.ponerApellido("Gomez");

		System.out.println("La persona 1 es " + per1.obtenerNombreCompleto());

		per2.ponerNombre("Juan");
		per2.ponerApellido("Elraton");

		System.out.println("La persona 2 es " + per2.obtenerNombreCompleto());

		per3 = new Persona("Maria", "Lagata");

		System.out.println("El nombre completo de la persona 3 es " + per3.obtenerNombreCompleto());

		per3.mostrarNombreCompleto();

		// Domicilio
		System.out.println("<<<SEGUIMOS CON EL DOMICILIO>>>");
		
		 Domicilio domi1 = new Domicilio();
		 domi1.setCalle("Yatay");
		 domi1.setNumero(240);
		 domi1.setCiudad("CABA");
		
		 Domicilio domi2 = new Domicilio("Balcarce", 53, "CABA");
		
		 // Le pasamos el domicilio 1 a la persona 1
		 per1.setDomicilio(domi1);
		 per1.mostrarDomicilio();
		
		 per2.mostrarDomicilio();
		
		 domi1.setCalle("Belgrano");
		 per1.mostrarDomicilio();
		
		 per3.setDomicilio(domi2);

	}

}
