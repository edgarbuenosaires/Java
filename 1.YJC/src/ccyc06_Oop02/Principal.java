package ccyc06_Oop02;

public class Principal {

	public static void main(String[] args) {

		Fabrica f = new Fabrica();
		cargarFabrica(f);

		f.listarInstrumentos();

		/*
		 * ArrayList<Instrumento> lista = f.instrumentosPorTipo(TipoInstrumento.VIENTO);
		 * 
		 * for (Instrumento instrumento : lista) { System.out.println(instrumento); }
		 */
		double[] porc = f.porcInstPorTipo("Sucursal A");

		for (int i = 0; i < porc.length; i++) {
			System.out.println(porc[i]);
		}
		/*
		 * f.borrarInstrumento("TARG8");
		 * 
		 * 
		 * System.out.println("--- SE BORRA INSTRUMENTO ---:"); f.listarInstrumentos();
		 */
	}

	private static void cargarFabrica(Fabrica f) {
		Sucursal s1 = new Sucursal("Sucursal A");
		Sucursal s2 = new Sucursal("Sucursal B");

		s1.agregarInstrumento(new Instrumento("TJR4", 12345, TipoInstrumento.CUERDA));
		s1.agregarInstrumento(new Instrumento("TJG6", 34626, TipoInstrumento.VIENTO));
		s1.agregarInstrumento(new Instrumento("TRG8", 23453, TipoInstrumento.PERCUSION));

		s2.agregarInstrumento(new Instrumento("FKS5", 54321, TipoInstrumento.CUERDA));
		s2.agregarInstrumento(new Instrumento("PWG9", 52331, TipoInstrumento.VIENTO));

		f.agregarSucursal(s1);
		f.agregarSucursal(s2);
	}
}
