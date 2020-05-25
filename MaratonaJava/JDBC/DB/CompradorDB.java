package DB;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import JDBC.ConexaoFactory;

public class CompradorDB {
	public void save() {
		String sql = "INSERT INTO public.comprador(id_comprador, cpf, nome) VALUES (2, '020.722.100-12', 'Darkson');";
		Connection conn = ConexaoFactory.getConexao();
		try {
			Statement stmt = conn.createStatement();
			System.out.println(stmt.executeUpdate(sql));
			ConexaoFactory.close(conn, stmt);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
