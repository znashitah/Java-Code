package newmaven.newmaven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Jdbc1 implements Myjdbc {
	public Connection getconnection(String username, String password) throws SQLException {
		final String Database = "jdbc:mysql://localhost/JDBC";
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