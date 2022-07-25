package poo;

public class V41_Uso_Vehiculo {

	public static void main(String[] args) {

		// CREO UNA INSTANCIA DE LA CLASE COCHE
		V28_Coche micoche1 = new V28_Coche(); // new V28_Coche es el CONSTRUCTOR
		micoche1.estableceColor("Rojo");

		// CREO UNA INSTANCIA DE LA CASE FURGONETA
		V40_Furgoneta mifurgoneta1 = new V40_Furgoneta(580, 7);
		mifurgoneta1.estableceColor("azul"); // utilizamos metodos heredados
		mifurgoneta1.configuraAsientos("si"); // utilizamos metodos heredados
		mifurgoneta1.configuraClimatizador("si"); // utilizamos metodos heredados
		System.out.println(micoche1.dimeDatosGenerales() + "\n" + micoche1.dimeColor()
				+ "\n"); /* micoche1 no tiene el metodo DIME DATOS FURGONETA, PORQUE ES DE LA SUBCLASE */
		System.out.println(mifurgoneta1.dimeDatosGenerales() + "\n" + mifurgoneta1.dimeDatosFurgoneta() + "\n"
				+ mifurgoneta1.dimeColor() + "\n" + mifurgoneta1.dimeAsientos() + "\n"
				+ mifurgoneta1.dimeClimatizador()); // mifurgoneta1 tiene el metodo DIME DATOS FURGONETA

	}

}