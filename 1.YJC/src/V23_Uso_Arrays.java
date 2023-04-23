
public class V23_Uso_Arrays {
	public static void main(String[] args) {

		System.out.println("PRIMERA MATRIZ");

		// se puede poner los corchetes al final del nombre de la matriz o al principio.
		// "int mi_matriz [] = new int[5]";

		int[] mi_matriz = new int[5];
		mi_matriz[0] = 5;
		mi_matriz[1] = 38;
		mi_matriz[2] = -15;
		mi_matriz[3] = 92;
		mi_matriz[4] = 71;

		System.out.println(mi_matriz[3]);
		System.out.println("Impresion por pantalla de la matriz a traves de un bucle for");
		for (int i = 0; i < mi_matriz.length; i++) {
			System.out.println("Valor del indice " + i + "=" + mi_matriz[i]);

		}

		System.out.println("SEGUNDA MATRIZ");

		// Otra forma de declarar e inicializar una matriz

		int[] mi_matriz2 = { 34, 56, 2, -7, 39 };

		for (int i = 0; i < mi_matriz2.length; i++) {
			System.out.println("Valor del indice " + i + "= " + mi_matriz2[i]);

		}
	}
}
