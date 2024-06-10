package practice;

public class Patientmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patient r = new Patient();

		Patient smith;
		smith = new Patient("smith", 20); // yes this line work after making constructor
		Patient Rsmith = new Patient("R. Smith", 69);
		Patient jones = new Patient("G. Jones", 45, Rsmith);
		Patient williams = new Patient("J. Williams", 29, jones);

		System.out.println(Rsmith);
		System.out.println(jones);
		System.out.println(williams);
		System.out.println(smith);

	}

}
