package practice;

public class Shuffle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int y = 1;
		while (y < 10) {
			if (y > 3) {
				System.out.print("big x");
			}
		}

		int x = 3;
		while (x > 0) {
			if (x == 1) {
				System.out.print("d");
				x = x - 1;
			}

			if (x == 2) {
				System.out.print("b c");
			}
			if (x > 2) {
				System.out.print("a");
			}
			x = x - 1;
			System.out.print("-");
		}

	}

}
