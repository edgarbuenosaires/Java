import javax.swing.JOptionPane;

public class V24_Uso_Arrays2 {

	public static void main(String[] args) {

		String[] paises = new String[8];

		paises[0] = "Argentina";
		paises[1] = "Brazil";
		paises[2] = "Reino Unido";
		paises[3] = "Uruguay";
		paises[4] = "Canada";
		paises[5] = "Australia";
		paises[6] = "Francia";
		paises[7] = "Israel";

		// UTILIZACION DE BUCLE FOR TRADICIONAL

		for (int i = 0; i < paises.length; i++) {
			System.out.println("Pais " + (i + 1) + " " + paises[i]);
		}

		System.out.print("\n");

		// UTILIZACION DE BUCLE FOR EACH

		for (String elemento : paises) {
			System.out.println("PAIS: " + elemento);

		}

		// CARGA DEL ARRAY A TRAVES DEL TECLADO POR MEDIO DE JOPTIONPANE

		String[] capitales = new String[8];

		for (int i = 0; i < capitales.length; i++) {
			capitales[i] = JOptionPane.showInputDialog("Por favor ingrese la capital de " + (i + 1));
		}
		for (String elemento : capitales) {
			System.out.println("CAPITAL: " + elemento);
		}

		// CARGA DE UN ARRAY GRANDE

		int[] matriz_aleatorios = new int[150];

		for (int i = 0; i < matriz_aleatorios.length; i++) {
			matriz_aleatorios[i] = (int) Math.round(Math.random() * 100);
		}

		for (int j : matriz_aleatorios) {

			System.out.print(matriz_aleatorios[j] + " - ");
		}

	}

}
