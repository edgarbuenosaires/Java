package tp1.tp3.ej10_puerto;

public class Principal {

	public static void main(String[] args) {
		Puerto p = new Puerto();

		Deportivo dep1 = new Deportivo("HY7", 25, 1985, "Edgardo Aguirre", 450000, 15670, 56, 78);
		Deportivo dep2 = new Deportivo("HY2", 55, 1945, "Jose Aguirre", 900000, 15670, 56, 78);
		Deportivo dep3 = new Deportivo("HY9", 95, 1990, "Eugenio Aguirre", 1250000, 15670, 56, 78);

		DeportivoLujo delu4 = new DeportivoLujo("ME5", 56, 2014, "Edgardo Gabriel Aguirre", 670000, 23786, 78, 53);
		DeportivoLujo delu5 = new DeportivoLujo("MT6", 26, 2021, "Edgardo Gabriel Aguirre", 560000, 23465, 43, 93);
		DeportivoLujo delu6 = new DeportivoLujo("MO23", 86, 2000, "Edgardo Gabriel Aguirre", 990000, 677456, 878, 23);

		Velero vel7 = new Velero("SD6", 72, 1987, "Jose Quiroga", 56000, 54000, 6);
		Velero vel8 = new Velero("PY6", 64, 1965, "Mario Quiroga", 75000, 38000, 4);
		Velero vel9 = new Velero("WD6", 29, 1937, "Kike Quiroga", 786000, 74000, 2);

		Yate ya10 = new Yate("UE4", 74, 1999, "Edgardo Pichulo Aguirre", 646456, 97392, 2);
		Yate ya11 = new Yate("TE4", 44, 1989, "Pichulo Aguirre", 6452346, 97392, 1);
		Yate ya12 = new Yate("UE4", 24, 1979, "Aguirre Pichulin", 766456, 97392, 3);

		p.amarrarEmbarcacion(dep1);
		p.amarrarEmbarcacion(dep2);
		p.amarrarEmbarcacion(dep3);
		p.amarrarEmbarcacion(delu4);
		p.amarrarEmbarcacion(delu5);
		p.amarrarEmbarcacion(delu6);
		p.amarrarEmbarcacion(vel7);
		p.amarrarEmbarcacion(vel8);
		p.amarrarEmbarcacion(vel9);
		p.amarrarEmbarcacion(ya10);
		p.amarrarEmbarcacion(ya11);
		p.amarrarEmbarcacion(ya12);

		System.out.println("Barco con mayor consumo: " + p.barcoConMayorConsumo());
		System.out.println("Barco con alquiler mayor a 10000 " + p.barcosConAlquilerMayorA(10000));

		p.mostrarListado();

	}

}
