package TesteConexão5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionFactoy {
	public static Connection getConecxao() {
		String url = "jdbc:postgresql://localhost/projeto";
		String user = "postgres";
		String password = "postgres";

	//	Connection conn = ConnectionFactoy.getConecxao();

		try {
			return DriverManager.getConnection(url, user, password);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	public static void close(Connection conn) {
		try{
			conn.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void close(Connection conn, Statement stmt) {
		close(conn);
		try{
			stmt.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public static void close(Connection conn, Statement stmt, ResultSet rs) {
		close(conn, stmt);
		try{
			rs.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
