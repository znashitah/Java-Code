package assignments;

public class Mallerduck extends Duck {
	Mallerduck() {
		qb = new Quack();
		fl = new Flywithwings();
		db = new Diveable();
	}

	void display() {
		System.out.println("iam mallerduck");
	}

}
