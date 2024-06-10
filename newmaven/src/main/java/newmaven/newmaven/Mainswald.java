package newmaven.newmaven;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Mainswald {

	private static final String COLOUR = null;

	public static void main(String[] args) throws SQLException {
		Myjdbc s1 = new Swald1();
		// TODO Auto-generated method stub
		Connection bonn;
		bonn = s1.getconnection("root", " Usman123");
		ResultSet rs1;
		rs1 = s1.executeQUERY("SELECT * FROM SHWARZWALD.COW", bonn);

		while (rs1.next()) {
			int COWID = rs1.getInt(1);
			String NAME = rs1.getString(2);
			String COLOUR = rs1.getString(3);
			int AGE = rs1.getInt(4);
			int FAMILYID = rs1.getInt(5);
			System.out.println(
					"COW ID " + COWID + "name " + NAME + " COLOUR " + COLOUR + "AGE" + AGE + "FAMILYID" + FAMILYID);
		}
		rs1.close();
		bonn.close();

	}

}
