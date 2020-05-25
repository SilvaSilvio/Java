package ConexaoTesteMain;

import Conexao.ConexaoFactory;

public class ConexaoTesteMain {

	public static void main(String[] args) {
		ConexaoFactory conn = new ConexaoFactory();
		conn.getConexao();
		System.out.println(conn);
	}

}
