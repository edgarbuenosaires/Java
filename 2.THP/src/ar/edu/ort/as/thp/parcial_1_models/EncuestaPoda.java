package ar.edu.ort.as.thp.parcial_1_models;

import java.util.Scanner;

public class EncuestaPoda {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int EDAD_MINIMA = 18;
		final char SI = 'S';
		final char NO = 'N';
		final char BLANCO = 'B';
		final char FIN = 'F';
		char opcionVotada;
		int edadVotante;
		boolean esOpcionValida;
		int acumuladorEdades = 0;
		int contSi = 0;
		int contNo = 0;
		int contBlanco = 0;
		double promedio;
		double porcentaje;
		String opcionGanadora;
		System.out.println("Bienvenidos a la encuesta de la poda!");
		do {
			System.out.println("Ingrese la opción votada: ");
			opcionVotada = input.nextLine().toUpperCase().charAt(0);
			;
			esOpcionValida = (opcionVotada == SI)
					|| ((opcionVotada == NO) || (opcionVotada == BLANCO) || (opcionVotada == FIN));
		} while (!esOpcionValida);
		while (opcionVotada != FIN) {
			do {
				System.out.println("Ingrese la edad del votante: ");
				edadVotante = Integer.parseInt(input.nextLine());
			} while (edadVotante < EDAD_MINIMA);
			acumuladorEdades += edadVotante;
			switch (opcionVotada) {
			case SI:
				contSi++;
				break;
			case NO:
				contNo++;
				break;
			case BLANCO:
				contBlanco++;
				break;
			}
			do {
				System.out.println("Ingrese la opción votada: ");
				opcionVotada = input.nextLine().toUpperCase().charAt(0);
				;
				esOpcionValida = (opcionVotada == SI)
						|| ((opcionVotada == NO) || (opcionVotada == BLANCO) || (opcionVotada == FIN));
			} while (!esOpcionValida);
		}
		input.close();
		if ((contSi > contNo) && (contSi > contBlanco)) {
			opcionGanadora = "Ganó el SI";
		} else if (contNo > contBlanco) {
			opcionGanadora = "Ganó el NO";
		} else {
			opcionGanadora = "INDETERMINADO";
		}
		porcentaje = (double) contNo * 100 / (contNo + contSi + contBlanco);
		promedio = (double) acumuladorEdades / (contSi + contNo + contBlanco);
		System.out.println("Opción ganadora: " + opcionGanadora);
		System.out.println("Promedio de edad de los votantes: " + promedio);
		System.out.println("El porcentaje que no desea que se poden los arboles es del: " + porcentaje + "%");
	}

}
