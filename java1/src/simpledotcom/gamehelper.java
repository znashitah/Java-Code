package simpledotcom;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class gamehelper {
	public String getUserInput(String prompt) {
		String inputline = null;
		System.out.println(prompt + "");
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			inputline = br.readLine();

			if (inputline.length() == 0)
				return null;
		}

		catch (IOException e) {
			System.out.println("IOException: " + e);
		}
		return inputline;

	}

}
