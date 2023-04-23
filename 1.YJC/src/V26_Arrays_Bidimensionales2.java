
public class V26_Arrays_Bidimensionales2 {

	public static void main(String[] args) {
		int[][] matriz = { { 10, 34, 678, 45, 87 }, { 245, 784, 234, 87, 98 }, { 67, 2, 98, 90, 29 },
				{ 83, 87, 10, 97, 72 } };

		// MUESTRO LA FILA DE LA MATRIZ atencion (int[] fila:matriz)
		for (int[] fila : matriz) {

			// MUESTRO CADA VECTOR DE LA FILA atencion (int z:fila)
			for (int z : fila) {

				System.out.print(z + " ");
			}
			System.out.println();
		}

	}

}
