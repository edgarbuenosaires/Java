package ar.edu.ort.as.thp.tp3.ej01;

import java.util.ArrayList;

public class Agenda {

	private ArrayList<Persona> personas;

	public Agenda() {
		// Se instancia como buena practica el Array List
		this.personas = new ArrayList<Persona>();
	}

	public void listarPersonas() {
		int i = 0;
		Persona per;
		while (i < this.personas.size()) {
			per = this.personas.get(i);
			per.mostrar();
			i++;
		}
		// // Con FOR EACH
		// for (Persona persona : this.personas) {
		// persona.mostrar();
		// }
	}

	private Persona buscarPersona(String dni) {
		int i = 0;
		Persona per;
		Persona perEncontrada = null;
		boolean encontre = false;

		while (i < this.personas.size() && !encontre) {
			per = this.personas.get(i);
			if (per.getDni().equals(dni)) {
				encontre = true;
				perEncontrada = per;
			} else {
				i++;
			}
		}
		return perEncontrada;
	}

	public boolean agregarPersona(String dni, String nombre, String apellido, int edad, char sexo,
			Domicilio domicilio) {
		Persona per;
		boolean resultado = false;

		per = this.buscarPersona(dni);
		if (per == null) {
			per = new Persona(dni, nombre, apellido, edad, sexo, domicilio);
			this.personas.add(per);
			resultado = true;
		}
		return resultado;
	}

	public Persona removerPersona(String dni) {
		Persona per;

		per = this.buscarPersona(dni);
		if (per != null) {
			this.personas.remove(per);
		}
		return per;
	}

	public boolean modificarDomicilio(String dni, Domicilio domicilio) {
		Persona per;
		boolean resultado = false;

		per = this.buscarPersona(dni);
		if (per != null) {
			per.setDomicilio(domicilio);
			resultado = true;
		}
		return resultado;
	}

	public Persona devolverUltimo() {
		Persona per = null;
		if (!this.personas.isEmpty()) {
			per = this.personas.get(this.personas.size() - 1);
		}
		return per;
	}

	public void eliminarTodosLosElementosAMano() {
		while (!this.personas.isEmpty()) {
			this.personas.remove(0);
		}
	}

}
