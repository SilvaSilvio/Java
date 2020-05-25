package Test2InserindoValores;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConectionFactory {
	public static Connection getConexao() {
		String url = "jdbc:postgresql://localhost/projeto";
		String user = "postgres";
		String password = "postgres";
		try {
			return DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;

	}
	public static void close(Connection connection) {
		try {
			if(connection != null)
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void close(Connection connection, Statement stmt) {
		close(connection);
		try {
			if(stmt != null)
				stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
