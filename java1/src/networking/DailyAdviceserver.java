package networking;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class DailyAdviceserver {
	String[] Advicelist = { "take small bites", "go for tight jeans", "no, they do no make you look fat",
			"one word :inappropriate", "just for today be honest,work hard", "tell your boos what you are",
			"you may think about your haircut" };

	public void go() {
		try {
			ServerSocket serversock = new ServerSocket(4242);
			while (true) {
				Socket sock = serversock.accept();
				PrintWriter writer = new PrintWriter(sock.getOutputStream());

				for (int i = 0; i < 3; i++) {
					String advice = getAdvice();
					writer.println(advice);
					System.out.println(advice);
				}

				writer.close();

			}
		} catch (IOException i) {
			i.printStackTrace();
		}

	}

	private String getAdvice() {
		int random = (int) (Math.random() * Advicelist.length);
		return Advicelist[random];
	}

}
