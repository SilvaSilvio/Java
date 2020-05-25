package TesteConexão1;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CompradorBD {
	public void save(Comprador comprador) {
		String sql = "INSERT INTO public.comprador(cpf, nome) VALUES ('" + comprador.getCpf() + "', '"
				+ comprador.getNome() + "');";
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

	public void delete(Comprador comprador) {
		if (comprador.getNome() == null) {
			System.out.println("Não é possível deletar os dados");
			return;
		}

		String sql = "DELETE FROM public.comprador WHERE id_comprador = '" + comprador.getId_comprador() + "';";
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

	public void update(Comprador comprador) {
		if (comprador.getNome() == null) {
			System.out.println("Os dados não existem para atulização");
			return;
		}
		String sql = "UPDATE public.comprador SET cpf = '" + comprador.getCpf() + "', nome='" + comprador.getNome()
				+ "' WHERE id_comprador = '" + comprador.getId_comprador() + "'";
		Connection conn = ConnectFactory.getConexao();

		try {
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			System.out.println("Dados atualizado com sucesso");
			ConnectFactory.close(conn, stmt);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static List<Comprador> selectAll() {
		String sql = "select * from comprador";
		Connection conn = ConnectFactory.getConexao();
		List<Comprador> compradorList = new ArrayList<Comprador>();
		try {
			Statement stmt = conn.createStatement();
			ResultSet resultset = stmt.executeQuery(sql);
			while (resultset.next()) {
				compradorList.add(new Comprador(resultset.getInt("id_comprador"), resultset.getString("cpf"),
						resultset.getString("nome")));

				/* 
				 * System.out.println(resultset.getInt("id_comprador"));
				 * System.out.println(resultset.getString("nome"));
				 * System.out.println(resultset.getString("cpf")); / Pode se fazer a buscas
				 * tanto pelo nome quanto pelo numero da coluna
				 */
			}
			ConnectFactory.close(conn, stmt, resultset);
			return compradorList;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void selectMetaData() {
		Connection conn = ConnectFactory.getConexao();
		String sql = "Select * from Comprador";
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			ResultSetMetaData rsmd = rs.getMetaData();
			rs.next();
			int quantCollumn = rsmd.getColumnCount();
			System.out.println("Quantidade de Colunas: " + quantCollumn);
			for (int i = 1; i <= quantCollumn; i++) {
				System.out.println("Nome da Coluna: " + rsmd.getColumnName(i));
				System.out.println("Nome da Tabela: " + rsmd.getTableName(i));
				System.out.println(rsmd.getColumnDisplaySize(i));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void checkedDriverStatus() {
		Connection conn = ConnectFactory.getConexao();
		try {
			DatabaseMetaData dbmd = conn.getMetaData();
			if (dbmd.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)) {
				System.out.println("Suporta TYPE_FORWARD_ONLY");
			}
			if (dbmd.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)) {
				System.out.println("Também suporta CONCUR_UPDATABLE");
			}

			if (dbmd.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)) {
				System.out.println("Suporta TYPE_SCROLL_INSENSITIVE");
			}
			if (dbmd.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
				System.out.println("Também suporta CONCUR_UPDATABLE");
			}

			if (dbmd.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE)) {
				System.out.println("Suporta TYPE_SCROLL_SENSITIVE");
			}
			if (dbmd.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
				System.out.println("Também suporta CONCUR_UPDATABLE");
			}
			ConnectFactory.close(conn);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void testTypeScroll() {
		String sql = "select * from comprador";
		Connection conn = ConnectFactory.getConexao();
		List<Comprador> compradorList = new ArrayList<Comprador>();
		try {
			Statement stmt = conn.createStatement();
			ResultSet resultset = stmt.executeQuery(sql);
			if(resultset.last()) {
				System.out.println("Ultima Linha" + new Comprador(resultset.getInt("id_comprador"), resultset.getString("cpf"),
						resultset.getString("nome")));
				System.out.println("Numero da Ultima linha" + resultset.getRow());

			}
			ConnectFactory.close(conn, stmt, resultset);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
