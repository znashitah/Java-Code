package simpledotcom;

import java.util.Random;

public class Mainsimpledotcom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numOfGuesses = 0;
		gamehelper helper = new gamehelper();
		simpledotcom theDotCom = new simpledotcom();
		Random rand = new Random();
		int randNum = (int) (rand.nextInt(5));
		int[] locations = { randNum, randNum + 1, randNum + 2 };

		for (int y : locations) {
			System.out.println(y);

		}
		theDotCom.setLocationCells(locations);
		boolean isAlive = true;
		while (isAlive) {
			String guess = helper.getUserInput("Enter a number:");
			String result = theDotCom.checkYouself(guess);
			numOfGuesses++;
			if (result.equals("kill")) {
				isAlive = false;
				System.out.println("You took " + numOfGuesses + " guesses");
			}
		}

	}

}
