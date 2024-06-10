package newmaven.newmaven;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public interface Myjdbc {
	public Connection getconnection(String username, String password) throws SQLException;

	ResultSet executeQUERY(String query, Connection conn) throws SQLException;
}
