package TesteConexão4;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import TesteConexão1.Comprador;
import TesteConexão1.ConnectFactory;

public class UsuarioDB {
	public void save() {
		String sql = "INSERT INTO public.usuario(nome_completo, usuario, senha, email) VALUES ('Silvio', 'Beuga', '123', 'silvio.silva@hotmail.com');";

		Connection conn = ConnectFactory.getConexao();
		try {
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			System.out.println("Dados inserido com sucesso");
			ConnectFactory.close(conn, stmt);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
