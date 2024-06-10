package com.sap.human;

public class SimpleDotComTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numOfGuesses = 0;

		GameHelper helper = new GameHelper();

		SimpleDotCom theDotCom = new SimpleDotCom();
		int randomNum = (int) (Math.random() * 5);

		int[] locations = { randomNum, randomNum + 1, randomNum + 2 };
		theDotCom.setLocationCells(locations);
		boolean isAlive = true;

		while (isAlive == true) {
			String guess = helper.getUserInput("enter a number ");
			String result = theDotCom.checkYouself(guess);
			numOfGuesses++;
			if (result.equals("kill")) {
				isAlive = false;
				System.out.println("You took " + numOfGuesses + " guesses");
			}

		}

	}
}
