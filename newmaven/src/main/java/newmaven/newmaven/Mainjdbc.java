package newmaven.newmaven;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Mainjdbc {

	private static final String PRODUCTS1ID = null;

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Myjdbc b1 = new Business();
		Connection conn;
		conn = b1.getconnection("root", "Usman123");
		ResultSet rs;
		rs = b1.executeQUERY("SELECT * FROM business.PRODUCT", conn);
		while (rs.next()) {
			int pno = rs.getInt(1);
			String name = rs.getString(2);
			int price = rs.getInt(3);
			System.out.println("pno : " + pno + "name " + name + " price " + price);
		}
		rs.close();
		conn.close();
		Myjdbc b2 = new Jdbc1();
		Connection zonn;
		zonn = b2.getconnection("root", "Usman123");
		ResultSet r2;
		r2 = b2.executeQUERY("SELECT * FROM JDBC.PRODUCTS1", zonn);
		while (r2.next()) {
			int productid = r2.getInt(1);
			int price = r2.getInt(2);
			String name = r2.getString(3);
			String type = r2.getString(4);

			System.out.println("productid " + productid + "price " + price + "name " + name + "type " + type);
		}

	}

}
