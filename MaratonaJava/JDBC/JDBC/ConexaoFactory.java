package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexaoFactory {

	// PODEMOS COLOCAR COMO ESTÁTICO OU NAO
	public static Connection getConexao() {
		// public Connection getConexao() {
		String url = "jdbc:postgresql://localhost/agencia";
		String user = "postgres";
		String password = "postgres";

		try {

			// Connection connection = DriverManager.getConnection(url, user, password);
			return DriverManager.getConnection(url, user, password);
			// System.out.println(connection);
			// return connection;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;

	}

	public static void close(Connection conexao) {
		try {
			if (conexao != null)
				conexao.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void close(Connection conexao, Statement stmt) {
		close(conexao);
		try {
			if (stmt != null)
				stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
