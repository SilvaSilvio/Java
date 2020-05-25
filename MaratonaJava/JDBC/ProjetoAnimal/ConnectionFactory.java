package ProjetoAnimal;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionFactory {

	public static Connection getConnection() {
		String url = "jdbc:postgresql://localhost/projeto";
		String user = "postgres";
		String password = "postgres";

		return null;

	}

	public static void close(Connection connection) {
		try {
			if (connection != null)
				connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void close(Connection connection, Statement stmt) {
		try {
			if (stmt != null)
				stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
