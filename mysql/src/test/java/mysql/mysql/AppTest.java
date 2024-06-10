package mysql.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.jupiter.api.Test;

public class AppTest {

	@Test
	public void shouldAnswerWithTrue() throws SQLException {
		// TODO Auto-generated method stub
		final String Database = "jdbc:mysql://127.0.0.1/business";
		// final String Database = "jdbc:mysql://localhost/business";
		final String QUERY = "SELECT * FROM business.PRODUCT";
		// Scanner scanner = new Scanner(System.in);
		// System.out.println("PW: ");
		// String pw = scanner.nextLine();
		// scanner.close();
		Connection conn = DriverManager.getConnection(Database, "root", "Usman123");
		PreparedStatement stmt = conn.prepareStatement(QUERY);
		// stmt.setInt(1, 0);
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
