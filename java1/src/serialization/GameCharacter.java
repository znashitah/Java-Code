package serialization;

import java.io.Serializable;

public class GameCharacter implements Serializable {
	int power;
	String type;
	String[] weapon;

	GameCharacter(int a, String b, String[] c) {
		power = a;
		type = b;
		weapon = c;

	}

	public int getpower() {
		return power;
	}

	public String gettype() {
		return type;
	}

	public String getweapon() {
		String weaponList = " ";
		int i;
		for (i = 0; i < weapon.length; i++) {
			weaponList += weapon[i] + "";

		}
		return weaponList;
	}

}
