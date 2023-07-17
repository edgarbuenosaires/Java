package tp1.parcial1.naves;

public class Test {

	private static final String MATRICULA_EXISTENTE = "EXI6";
	private static final String MATRICULA_INEXISTENTE = "FAKE";

	public static void main(String[] args) {

		EstacionEspacial ee = new EstacionEspacial();

		atracar6Naves(ee);
		System.out.println("--------------------");
		ee.imprimirManifiestos();
		System.out.println("--------------------");
		desatracarNave(ee, MATRICULA_EXISTENTE);
		desatracarNave(ee, MATRICULA_INEXISTENTE);
		desatracarNave(ee, "TM1");
		System.out.println("--------------------");
		ee.imprimirManifiestos();
		System.out.println("--------------------");
		atracarNaveCargaToxica(ee, "TOX7");
		atracarNaveCargaIndustrialContaminante(ee, "CONT4");
		atracarNaveCargaAlimenticia(ee, "ALIM9");
		System.out.println("--------------------");
		ee.imprimirManifiestos();
	}

	private static void atracar6Naves(EstacionEspacial ee) {
		atracarNave(ee, new NaveCruiser("Niamos", "Niamos", 10, "Jedi Express", 40, "JE1"));
		atracarNave(ee, new NaveCruiser("Corellia", "Coruscant", 10, "Jedi Express", 0, "JE2"));
		atracarNave(ee, new NaveCruiser("Tatooine", "Endor", 3, "Jedi Express", 50, MATRICULA_EXISTENTE));
		atracarNave(ee, new NaveCruiser("Corellia", "Coruscant", 8, "Jedi Express", 20, MATRICULA_EXISTENTE));
		atracarNave(ee, new NaveCruiser("Mandalor", "Mandalor", 8, "The Mandalorians", 100, "TM1"));
		atracarNave(ee, new NaveCruiser("Nevarro", "Trandosha", 3, "The Mandalorians", 20, "TM2"));
	}

	private static void desatracarNave(EstacionEspacial ee, String matriculaDeNave) {
		Nave n = ee.desatracar(matriculaDeNave);
		System.out.print(matriculaDeNave + ": ");
		System.out.print(n == null ? "NO " : "");
		System.out.println("se pudo desatracar");
	}

	private static void atracarNave(EstacionEspacial ee, Nave nave) {
		System.out.print(nave.getMatricula() + ": ");
		System.out.print(ee.estacionarNave(nave) ? "" : "NO ");
		System.out.println("se pudo atracar");
	}

	private static void atracarNaveCargaToxica(EstacionEspacial ee, String matricula) {
		NaveCargo n = crearNaveCarga(matricula);
		// TODO Generar la carga y ponerla en la nave
		CargaToxica ct = new CargaToxica("TNT", 200, "Explosivos");
		n.cargar(ct);
		atracarNave(ee, n);
	}

	private static void atracarNaveCargaIndustrialContaminante(EstacionEspacial ee, String matricula) {
		NaveCargo n = crearNaveCarga(matricula);
		// TODO Generar la carga y ponerla en la nave
		CargaIndustrial ci = new CargaIndustrial("Plastico", 400, false, "Construccion");
		n.cargar(ci);
		atracarNave(ee, n);
	}

	private static void atracarNaveCargaAlimenticia(EstacionEspacial ee, String matricula) {
		NaveCargo n = crearNaveCarga(matricula);
		// TODO Generar la carga y ponerla en la nave
		CargaAlimenticia ca = new CargaAlimenticia("Harina", 500, "Para panificacion", false);
		n.cargar(ca);
		atracarNave(ee, n);
	}

	private static NaveCargo crearNaveCarga(String matricula) {
		return new NaveCargo("Alderaan", "Naboo", 5, "Naviera Naboo", matricula);
	}
}
