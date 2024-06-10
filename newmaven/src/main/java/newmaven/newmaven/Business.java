package newmaven.newmaven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Business implements Myjdbc {

	@Override
	public Connection getconnection(String username, String password) throws SQLException {
		final String Database = "jdbc:mysql://localhost/business";
		Connection conn = DriverManager.getConnection(Database, "root", "Usman123");
		return conn;

	}

	@Override
	public ResultSet executeQUERY(String query, Connection conn) throws SQLException {

		PreparedStatement stmt = conn.prepareStatement(query);
		ResultSet rs = stmt.executeQuery();
		return rs;

	}

}
