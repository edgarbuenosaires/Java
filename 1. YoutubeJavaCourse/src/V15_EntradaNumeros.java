import javax.swing.JOptionPane;

public class V15_EntradaNumeros {
	public static void main(String[] args) {

//		double x = 10000.0;
//
//		System.out.printf("%1.2f", x / 3);
		// printf imprime con formato (2f) le da 2 desimales al resultado.

		String num1 = JOptionPane.showInputDialog("Introduce un numero:");

		double num2 = Double.parseDouble(num1); // se convierte el String en un double con el metodo parseDouble de la
												// clase Double
		System.out.print("La raiz de " + num2 + " es: ");
		System.out.printf("%1.2f", Math.sqrt(num2));

	}

}
