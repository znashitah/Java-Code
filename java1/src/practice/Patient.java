package practice;

public class Patient {
	public String name;
	public int age;
	Patient beforeMe;
	int number;

	public String isFirst;

	public static int followingNumber = 0;

	public Patient() {
		followingNumber = followingNumber + 1;
		number = followingNumber;
	}

	public int ageDifference(int age) {
		return Math.abs(age - this.age);
	}

	Patient(String a, int b) {
		name = a;
		age = b;
		number = ++followingNumber;
	}

	Patient(String a, int b, Patient c) {
		name = a;
		age = b;
		beforeMe = c;
		number = ++followingNumber;

	}

	public String toString() {
		String printText = name + " (" + number + ") ";
		if (beforeMe != null) {
			printText = printText + " comes after " + beforeMe.toString();
		}
		return printText;
	}

}
