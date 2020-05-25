package Test2InserindoValores;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class EletrodomesticoDB {
	public void save(Eletrodomestico eletrodomestico) {
		String sql = "INSERT INTO eletrodomestico(nome, valor) VALUES ('" + eletrodomestico.getNome() + "', '"
				+ eletrodomestico.getValor() + "');";
		Connection conn = ConectionFactory.getConexao();
		try {
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			ConectionFactory.close(conn, stmt);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void delete(Eletrodomestico eletrodomestico) {
		if (eletrodomestico == null) {
			System.out.println("Não foi possível excluir o registro");
			return;
		}
		String sql = "DELETE FROM public.eletrodomestico\n" + " WHERE nome = '" + eletrodomestico.getNome() + "'";
		Connection conn = ConectionFactory.getConexao();
		try {
			Statement stmt = conn.createStatement();
			System.out.println(stmt.executeUpdate(sql));
			ConectionFactory.close(conn, stmt);
			System.out.println("Registro excluido com sucesso");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void udate(Eletrodomestico eletrodomestico) {
		if (eletrodomestico == null) {
			System.out.println("Não foi possível atualizar o registro");
			return;
		}
		String sql = "UPDATE eletrodomestico SET nome = '" + eletrodomestico.getNome() + "', valor = '"+eletrodomestico.getValor()+"' WHERE 'nome' = '"
				+ eletrodomestico.getNome() + "';";
		Connection conn = ConectionFactory.getConexao();
		
		try {
			Statement stmt = conn.createStatement();
			System.out.println(stmt.executeUpdate(sql));
			ConectionFactory.close(conn, stmt);
			System.out.println("Registro atualizado com sucesso");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
