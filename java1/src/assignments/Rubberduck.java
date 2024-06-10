package assignments;

public class Rubberduck extends Duck {
	Rubberduck() {
		qb = new Mutequack();
		fl = new Flynoway();
		db = new Divenoway();
	}

	@Override
	void display() {
		System.out.println("iam rubberduck");

	}

}
