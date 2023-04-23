package ccyc04_static;

public class Principal {

	public static void main(String[] args) {
		Ticket t1 = new Ticket("2021/07/20", "56546299");
		Ticket t2 = new Ticket("2021/07/16", "52345324");
		Ticket t3 = new Ticket("2021/07/19", "72546734");
		Ticket t4 = new Ticket("2021/07/18", "85678768");

		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(t4);
	}

}
