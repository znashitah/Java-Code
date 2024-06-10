package assignments;

public abstract class Duck {
	Quackbehav qb;
	Flybehaviour fl;
	Divebehav db;

	abstract void display();

	void performquack() {
		qb.quack();

	}

	void performfly() {
		fl.fly();

	}

	void performdive() {

		db.dive();
	}

	void setQuackbehav(Quackbehav b) {
		this.qb = b;
	}

	void setDivebehav(Divebehav c) {
		this.db = c;
	}

}
