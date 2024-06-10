package simpledotcom;

class simpledotcom {
	int[] locationCells;
	int numOfHits = 0;

	public void setLocationCells(int[] locs) {
		locationCells = locs;
	}

	public String checkYouself(String stringGuess) {
		int guess = Integer.parseInt(stringGuess);
		String result = "miss";

		for (int cell : locationCells) {
			if (guess == cell) {
				result = "hit";
				numOfHits++;
				break;
			}
		}

		if (numOfHits == locationCells.length) {
			result = "kill";
		}
		System.out.println(result);
		return result;
	}

}
