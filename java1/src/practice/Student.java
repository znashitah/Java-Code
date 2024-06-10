package practice;

public class Student {
	private String name;
	private int number;
	private String degreeprogramm;
	private int birthyear;
	static int counter;
	private String gender;
	private final static String male = "male";
	private final static String female = "female";

	Student(String gender) {
		this();
		if (gender == male) {
			gender = male;
		} else if (gender == female) {
			gender = female;
		}

	}

	Student() {
		counter = counter + 1;
	}

	Student(String a, int b, String c, int d) {
		this();

		name = a;
		number = b;
		degreeprogramm = c;
		birthyear = d;

	}

	void setname(String a) {
		name = a;
	}

	String getname() {
		return name;
	}

	int getnumber() {
		return number;
	}

	void setnumber(int b) {
		number = b;
	}

	String getdegreeprogramm() {
		return degreeprogramm;
	}

	void setdegreeprogramm(String c) {
		degreeprogramm = c;
	}

	int getbirthyear() {
		return birthyear;
	}

	void setbirthyear(int d) {
		birthyear = d;

	}

	int getcount() {
		return counter;
	}

}
