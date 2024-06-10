package assignments;

public class Mainduck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mallerduck d2 = new Mallerduck();
		d2.display();
		d2.performfly();
		d2.performquack();
		d2.performdive();
		System.out.println("iam redheadduck");
		Redheadduck d3 = new Redheadduck();
		d3.performfly();
		d3.performquack();
		d3.performdive();
		d3.display();
		System.out.println("iam rubberduck");
		Rubberduck d4 = new Rubberduck();
		d4.performfly();
		d4.performquack();
		d4.display();
		d4.performdive();
		System.out.println("iam african duck");
		Africanduck d5 = new Africanduck();
		d5.performdive();
		Divenoway f = new Divenoway();
		d5.setDivebehav(f);
		d5.performdive();
		System.out.println("iam puffduck");
		Puffduck d6 = new Puffduck();
		d6.display();

	}

}
