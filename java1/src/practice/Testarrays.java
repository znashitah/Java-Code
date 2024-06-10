package practice;

public class Testarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] island = new String[4];
		island[0] = "barmuda";
		island[1] = "fiji";
		island[2] = "azores";
		island[3] = "cazomel";
		int[] index = new int[4];
		index[0] = 1;
		index[1] = 3;
		index[2] = 0;
		index[3] = 2;
		int y = 0;
		int ref;
		while (y < 4) {
			ref = index[y];

			System.out.print("island = ");
			System.out.println(island[ref]);
			y = y + 1;
		}

	}

}
