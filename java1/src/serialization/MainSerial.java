package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MainSerial {

	public static void main(String[] args) {
		Box mybox = new Box();
		mybox.setheight(20);
		mybox.setwidth(30);
		try {
			FileOutputStream fs = new FileOutputStream("/Users/nashitahzainab/Desktop/serial.txt");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(mybox);
			os.close();

		} catch (Exception ex) {
			ex.printStackTrace();

		}

		try {
			FileInputStream fs = new FileInputStream("/Users/nashitahzainab/Desktop/serial.txt");
			ObjectInputStream os = new ObjectInputStream(fs);
			Object readObject = os.readObject();
			Box mybox2 = (Box) readObject;
			System.out.print(mybox2.getheight() + "   " + mybox2.getwidth());
			os.close();

		} catch (Exception ex) {
			ex.printStackTrace();

		}
	}
}