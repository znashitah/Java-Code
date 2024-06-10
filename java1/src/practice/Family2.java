package practice;

import java.util.ArrayList;
import java.util.List;

public class Family2 {
	String fname;
	String origin;
	int kids;
	String location;
	Religion religion;
	List<String> names = new ArrayList<>();

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public int getKids() {
		return kids;
	}

	public void setKids(int kids) {
		this.kids = kids;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Religion getReligion() {
		return religion;
	}

	public void setReligion(Religion religion) {
		this.religion = religion;
	}

	Family2(String a, String b, int c, String l, Religion m) {
		fname = a;
		origin = b;
		kids = c;
		location = l;
		religion = m;

	}

	void setmembers(String c) {

		names.add(c);
	}

	List<String> getmembers() {
		for (int i = 0; i < names.size(); i = i + 1) {
			System.out.println(names.get(i));

		}
		return names;

	}

}
