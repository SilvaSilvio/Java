package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {

	public Connection getConexao() {
		String url = "jdbc:postgresql://localhost/projeto";
		String usuario = "postgres";
		String senha = "postgres";
		try {
			Connection connection = DriverManager.getConnection(url, usuario, senha);
			return connection;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
