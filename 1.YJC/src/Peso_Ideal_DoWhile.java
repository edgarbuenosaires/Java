import javax.swing.JOptionPane;

public class Peso_Ideal_DoWhile {

	public static void main(String[] args) {
		String genero = "";
		int altura;
		int pesoIdeal = 0;
		final int VALOR_HOMBRES = 110;
		final int VALOR_MUJERES = 120;

		do {
			genero = JOptionPane.showInputDialog("Introduce tu genero (H/M)");
		} while (genero.equalsIgnoreCase("H") == false && genero.equalsIgnoreCase("M") == false);

		altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en CM"));

		if (genero.equalsIgnoreCase("H")) {
			pesoIdeal = altura - VALOR_HOMBRES;

		} else if (genero.equalsIgnoreCase("M")) {
			pesoIdeal = altura - VALOR_MUJERES;

		}
		System.out.println("Tu peso ideal es: " + pesoIdeal + " Kg.");
	}

}
