package exams.threads;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	String text = " iam new server";

	public void go() {
		try {
			ServerSocket server = new ServerSocket(4242);
			while (true) {
				Socket sock = server.accept();
				PrintWriter writer = new PrintWriter(sock.getOutputStream());

				writer.println(text);
				System.out.println(text);

				writer.close();
			}

		} catch (IOException e) {
			e.printStackTrace();

		}

	}

}
