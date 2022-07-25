
public class V25_Arrays_Bidimensionales {

	public static void main(String[] args) {
		int[][] matrix = new int[4][5];

		matrix[0][0] = 34;
		matrix[0][1] = 45;
		matrix[0][2] = 87;
		matrix[0][3] = 60;
		matrix[0][4] = 91;

		matrix[1][0] = 23;
		matrix[1][1] = 84;
		matrix[1][2] = 90;
		matrix[1][3] = 14;
		matrix[1][4] = 28;

		matrix[2][0] = 45;
		matrix[2][1] = 56;
		matrix[2][2] = 85;
		matrix[2][3] = 30;
		matrix[2][4] = 16;

		matrix[3][0] = 96;
		matrix[3][1] = 89;
		matrix[3][2] = 48;
		matrix[3][3] = 20;
		matrix[3][4] = 26;

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println("En la posicion " + i + " " + j + " " + " es: " + matrix[i][j]);
			}

		}

	}

}
