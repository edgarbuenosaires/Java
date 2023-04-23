package ar.edu.ort.as.thp.tp2.ej10;

public class Test {
	public static void main(String[] args) {

		Robot robot1 = new Robot("Tuerquita");
		Robot robot2 = new Robot();

		robot2.setNombre("Arturito"); //R2D2

		robot1.saludar();
		robot2.saludar();

		System.out.println("========== SE ENVIA UNA PERSONA COMO PARAMETRO ==========");

		Persona per1;

		per1 = new Persona("Pablo");
		robot1.saludar(per1);

		System.out.println("========== SE INTENTA MOSTRAR UNA PERSONA NULL ==========");
		Persona per2 = null;
		robot2.saludar(per2);

	}
}
