package TesteConexão1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectFactory {
	// Connectic - realizar a conexao com o banco de dados.
	// Statement - Realizar operações que vai afetar o estado do banco e dados.
	// ResultSet - Buscar os resultados no BD.
	// DriveManeger - Responsavel por buscas o conector especifico do banco de dados
	// e retorna para voce una conexão.

	public static Connection getConexao() {
		String url = "jdbc:postgresql://localhost/projeto";
		String user = "postgres";
		String password = "postgres";
		try {
			return DriverManager.getConnection(url, user, password);
			// System.out.println(connection);
			// return connection;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;

	}

	public static void close(Connection conn) {
		try {
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void close(Connection conn, Statement stmt) {
		close(conn);
		try {
			if (stmt != null)
				stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void close(Connection conn, Statement stmt, ResultSet rs) {
		close(conn, stmt);
		try {
			if (rs != null)
				rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
