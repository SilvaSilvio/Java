package ProjetoComprador;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CompradorDB {
	public void save(Comprador comprador) {
		String sql = "INSERT INTO public.comprador(cpf, nome) VALUES ('" + comprador.getCpf() + "','"
				+ comprador.getNome() + "');";
		Connection conn = ConnectionFactory.getConexao();
		try {
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			ConnectionFactory.close(conn, stmt);
			System.out.println("Usuário cadastrado com sucesso");
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}

	public void delete(Comprador comprador) {
		String sql = "DELETE FROM public.comprador WHERE id_comprador = '" + comprador.getId_comprador() + "'";
		Connection conn = ConnectionFactory.getConexao();
		try {
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			ConnectionFactory.close(conn, stmt);
			System.out.println("Usuário excluido com sucesso");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void update(Comprador comprador) {
		//String sql = " UPDATE public.comprador SET 'cpf'= '"+ comprador.getCpf() +"' 'nome' = '" + comprador.getNome() + "' WHERE 'id_comprador' = '"
			//	+ comprador.getId_comprador() + "';";
		String sql = "UPDATE public.comprador SET cpf='020.722.788-02', nome= 'Severiano Silva' WHERE 'id_comprador' = '1'";

		Connection conn = ConnectionFactory.getConexao();
		try {
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			ConnectionFactory.close(conn, stmt);
			System.out.println("Usuário atualizado com sucesso");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
