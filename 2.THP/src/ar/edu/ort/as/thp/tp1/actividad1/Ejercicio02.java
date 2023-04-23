package ar.edu.ort.as.thp.tp1.actividad1;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//vARIABLES
		int nota1, nota2, nota3;
		double promedio;
		
		//Se piden las notas
		System.out.println("Ingrese la nota del 1er trimestre");
		nota1 = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese la nota del 2do trimestre");
		nota2 = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese la nota del 3er trimestre");
		nota3 = Integer.parseInt(input.nextLine());
		
		
		//Se Calcula el promedio
		promedio = (double) (nota1 + nota2 + nota3) / 3;
		System.out.println("El promedio del alumno es " + promedio);
		input.close();
	}

}
