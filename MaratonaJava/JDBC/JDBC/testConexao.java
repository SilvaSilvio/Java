package JDBC;

import java.sql.Connection;

import DB.CompradorDB;;

public class testConexao {

	public static void main(String[] args) {
//Connection conexao = ConexaoFactory.getConexao();
//conexao.getConexao();
	CompradorDB compradorDB = new CompradorDB();
	compradorDB.save();
	
	
	}

}
