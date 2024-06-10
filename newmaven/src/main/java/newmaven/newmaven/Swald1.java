package newmaven.newmaven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Swald1 implements Myjdbc {
	@Override
	public Connection getconnection(String username, String password) throws SQLException {
		final String Database = "JDBC:mysql://localhost/SHWARZWALD";
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
