package ar.edu.ort.as.thp.tp3.ej01;

public class Test {

	public static void main(String[] args) {
		Agenda agenda = new Agenda();

		System.out.println("Listar Personas Test 1");
		agenda.listarPersonas();

		Domicilio dom1 = new Domicilio("Rivadavia", "4500", "CABA");
		agenda.agregarPersona("0001", "Edgardo", "Aguirre", 37, 'M', dom1);
		agenda.agregarPersona("0002", "Juliana", "Gomez", 47, 'M', dom1);
		agenda.agregarPersona("0003", "Nelida", "Ochoa", 87, 'M', dom1);
		agenda.agregarPersona("0004", "Juan", "Zapata", 16, 'F', dom1);
		agenda.agregarPersona("0005", "Pepe", "Argento", 63, 'M', dom1);
		agenda.agregarPersona("0006", "Hernan", "Boton", 5, 'F', dom1);

		System.out.println("Listar Personas Test 2");
		agenda.listarPersonas();

		System.out.println("Removemos una persona por DNI");
		agenda.removerPersona("0003");
		agenda.listarPersonas();

		System.out.println("Cambiamos domicilio a Juan");
		Domicilio dom2 = new Domicilio("Belgrano", "422", "Bariloche");
		agenda.modificarDomicilio("0004", dom2);
		agenda.listarPersonas();

		System.out.println("El ultimo objeto del ArrayList es;");
		System.out.println(agenda.devolverUltimo());
		
		System.out.println("Eliminto el ArrayList de a uno");
		agenda.eliminarTodosLosElementosAMano();
		agenda.listarPersonas();

	}

}
