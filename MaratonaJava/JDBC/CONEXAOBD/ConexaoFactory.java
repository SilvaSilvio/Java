package CONEXAOBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {
	public Connection getConexao() {
		String url = "jdbc:postgresql://localhost/projeto";
		String user = "postgres";
		String password = "postgres";
		try {
			Connection connection = DriverManager.getConnection(url, user, password);
			System.out.println(connection);

			return connection;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}
}
