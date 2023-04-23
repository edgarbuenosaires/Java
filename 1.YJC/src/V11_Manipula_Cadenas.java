
public class V11_Manipula_Cadenas {

	public static void main(String[] args) {

		String nombre = "Edgardo";
		System.out.println("Mi nombre es " + nombre);
		
		// METODO LENGTH
		System.out.println("Mi nombre tiene: " + nombre.length() + " letras.");
		
		// METODO CHARAT
		System.out.println("La primera letra de: " + nombre + " es la " + nombre.charAt(0));
		int ultimaLetra = nombre.length();
		System.out.println("La ultima letra de " + nombre + " es " + nombre.charAt(ultimaLetra - 1));

	}

}
