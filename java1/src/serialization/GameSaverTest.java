package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class GameSaverTest {

	public static void main(String[] args) {
		GameCharacter one = new GameCharacter(50, "elf", new String[] { "bow", "sword", "dust" });
		GameCharacter two = new GameCharacter(200, "troll", new String[] { "bar hand", "big ex" });
		GameCharacter three = new GameCharacter(150, "magician", new String[] { "spell", "invisibility" });
		List<GameCharacter> team = new ArrayList<>();
		team.add(one);
		team.add(two);
		team.add(three);

		try {
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Game.ser"));
			os.writeObject(one);
			os.writeObject(two);
			os.writeObject(three);
			// os.writeObject(team);
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		team.removeAll(team);
		try {
			ObjectInputStream is = new ObjectInputStream(new FileInputStream("Game.ser"));
			// team = (List<GameCharacter>) is.readObject();
			int i;
			for (i = 0; i < team.size(); i++) {
				GameCharacter newobject = team.get(i);
				System.out.println(newobject.getpower());
				System.out.println(newobject.gettype());

			}

			GameCharacter oneRestore = (GameCharacter) is.readObject();
			GameCharacter twoRestore = (GameCharacter) is.readObject();
			GameCharacter threeRestore = (GameCharacter) is.readObject();
			System.out.println("one's type " + oneRestore.gettype());
			System.out.println("two's type " + twoRestore.gettype());
			System.out.println("three's type " + threeRestore.gettype());

		} catch (Exception i) {
			i.printStackTrace();
		}

	}

}
