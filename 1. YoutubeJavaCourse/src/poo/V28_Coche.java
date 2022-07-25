package poo;

public class V28_Coche {
	// PROPIEDADES COMUNES A TODOS LOS COCHES (TODOS LOS OBJETOS)
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int pesoPlataforma;

	// PROPIEDADES PARTICULARES DE CADA COCHE (CADA OBJETO)
	private String color;
	private double pesoTotal;
	private boolean asientosCuero, climatizador;

	public V28_Coche() { // CONSTRUCTOR
		ruedas = 4;
		largo = 2000;
		ancho = 300;
		motor = 1600;
		pesoPlataforma = 500;
	}

	public String dimeLargo() { // GETTER DEVUELVE UN STRING PERO EL LARGO ES INT
		return "El largo del choche es " + largo + " cm.";
	}

	public int getLargo() { // GETTER GENERADO AUTOMATICAMENTE
		return largo;
	}

	public String dimeDatosGenerales() { // GETTER ARMADO PERSONALMENTE DEVUELVE UN STRING
		return "La plataforma del vehiculo tiene " + ruedas + " ruedas. Mide " + largo / 1000
				+ " metros, con un ancho de " + ancho + " cm. el morot es" + motor
				+ " caballos de fuerza y un peso de plataforma de " + pesoPlataforma + " kg. ";
	}

	public void estableceColor(String colorCoche) { // SETTER GENERADO PERSONALMENTE
		color = colorCoche;
	}

	public String dimeColor() { // GETTER
		return "El color del coche es " + color;
	}

	public void configuraAsientos(String asientosCuero) { // SETTER
		if (asientosCuero.equalsIgnoreCase("si")) { // para comparar String se usa Equals
			this.asientosCuero = true; // THIS HACE REFERENCIA AL ATRIBUTO DE ESTA CLASE
		} else {
			this.asientosCuero = false; // THIS HACE REFERENCIA AL ATRIBUTO DE ESTA CLASE
		}
	}

	public String dimeAsientos() { // GETTER
		if (asientosCuero == true) {
			return "El coche tiene asientos de cuero";
		} else {
			return "El coche tiene asientos de serie";
		}
	}

	public void configuraClimatizador(String climatizador) { // SETTER

		if (climatizador.equalsIgnoreCase("si")) { // para comparar String se usa Equals
			this.climatizador = true;
		} else {
			this.climatizador = false;
		}
	}

	public String dimeClimatizador() {
		String dato;
		if (climatizador == true) {
			dato = "El coche incorpora climatizador.";
		} else {
			dato = "El coche lleva aire acondicionado";
		}
		return dato;
	}

	public String dimePesoCoche() { // SETTER Y GUETTER (Establece y muestra) NO ES BUENA PRACTICA
		double pesoCarroceria = 500;
		pesoTotal = pesoPlataforma + pesoCarroceria;
		if (asientosCuero == true) {
			pesoTotal = pesoTotal + 50;
		}
		if (climatizador == true) {
			pesoTotal = pesoTotal + 20;
		}
		return "El peso del coche es: " + pesoTotal;
	}

	public int dimePrecioCoche() { // GETTER DEL PRECIO TOTAL
		int precioFinal = 10000;
		if (asientosCuero == true) {
			precioFinal += 2000; // OPERADOR INCREMENTO
		}
		if (climatizador == true) {
			precioFinal += 1500;
		}
		return precioFinal;
	}
}
