package TesteConexão3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectFactory {
	public static Connection getConnection() {
		String url = "jdbc:postgresql://localhost/agencia";
		String user = "postgres";
		String password = "postgres";

		try {
			return DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void close(Connection conn) {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void close(Connection conn, Statement stmt) {
		close(conn);
		try {
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void close(Connection conn, Statement stmt, ResultSet rs) {
		close(conn, stmt);
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
