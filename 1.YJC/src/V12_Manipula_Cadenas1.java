
public class V12_Manipula_Cadenas1 {

	public static void main(String[] args) {

		// METODO SUBSTRING

		String frase = "Hoy es un estupendo dia para aprender a programar en Java";
		System.out.println(frase);
		String fraseResumen = frase.substring(0, 28) + " irnos a la playa y olvidarnos de todo... y "
				+ frase.substring(29, 57);
		System.out.println(fraseResumen);
	}

}
