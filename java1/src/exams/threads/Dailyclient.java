package exams.threads;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Dailyclient {
	public void go() {
		try {
			Socket s1 = new Socket("127.0.0.1", 4242);
			InputStreamReader streamreader = new InputStreamReader(s1.getInputStream());
			BufferedReader breader = new BufferedReader(streamreader);

			String advice = breader.readLine();
			System.out.println(advice);

			breader.close();
		} catch (IOException e) {
			e.printStackTrace();

		}

	}
}