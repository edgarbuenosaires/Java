
public class V26_Ejemp_Array_2D {
	public static void main(String[] args) {

		double acumulado;
		double interes = 0.10;

		double[][] saldo = new double[6][5];

		// Estaria trabajando la 1er dimension, las 6 columnas, inidicando la primer
		// fila con 10.000.
		for (int i = 0; i < 6; i++) {

			saldo[i][0] = 10000;
			acumulado = 10000;

			// Trabajo la 2da dimension, las 5 filas, comienzo en "j 1" porque "j 0" ya lo
			// complete con 10.000
			for (int j = 1; j < 5; j++) {

				acumulado = acumulado + (acumulado * interes);
				saldo[i][j] = acumulado;

			}
			interes = interes + 0.01;

		}

		for (int z = 0; z < 6; z++) {

			for (int h = 0; h < 5; h++) {

				System.out.printf("%1.2f", saldo[z][h]);
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}
