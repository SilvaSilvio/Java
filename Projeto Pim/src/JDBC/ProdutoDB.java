package JDBC;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import Entity.Produto;

public class ProdutoDB {
	public static void save(Produto produto) {
		String sql = "INSERT INTO produto( nome, preco_venda ) VALUES ('" + produto.getNome() + "','"
				+ produto.getValor() + "')";
		Connection conn = ConnectFactory.getConexao();
		try {
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			System.out.println("Produto inserido com sucesso");
			// ConnectionFactoy.close(conn, stmt);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void delete(Produto produto) {
		if (produto.getNome() == null) {
			System.out.println("Não é possível deletar os dados");
			return;
		}	
	String sql = "DELETE FROM PRODUTO WHERE id = '" + produto.getId() + "'";
	Connection conn = ConnectFactory.getConexao();

	try {
		Statement stmt = conn.createStatement();
		stmt.executeUpdate(sql);
		System.out.println("Dados deletado com sucesso");
		ConnectFactory.close(conn, stmt);
	} catch (SQLException e) {
		e.printStackTrace();
	}
}

}
