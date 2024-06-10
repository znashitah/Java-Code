package mysql.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Productmanager {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		final String Database = "jdbc:mysql://localhost/business";
		final String QUERY = "SELECT * FROM business.PRODUCT";
		// Scanner scanner = new Scanner(System.in);
		// System.out.println("PW: ");
		// String pw = scanner.nextLine();
		// scanner.close();
		Connection conn = DriverManager.getConnection(Database, "root", "Usman123");
		PreparedStatement stmt = conn.prepareStatement(QUERY);
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			int pno = rs.getInt(1);
			String name = rs.getString(2);
			int price = rs.getInt(3);
			System.out.println("pno : " + pno + "name " + name + " price " + price);
		}
		rs.close();
		conn.close();

	}

}
