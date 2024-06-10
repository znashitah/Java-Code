package networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class DailyClientAdvice {
	public void go() {
		try {
			Socket s = new Socket("127.0.0.1", 4242);
			InputStreamReader streamReader = new InputStreamReader(s.getInputStream());
			BufferedReader reader = new BufferedReader(streamReader);
			for (int i = 0; i < 3; i++) {
				String advice = reader.readLine();
				System.out.println("today advice is " + advice);
			}
			reader.close();

		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

}
