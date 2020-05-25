package CODIGO2;

import java.sql.*;
import java.util.*;

public class codigo4 {
	private static final String SENHA = "postgres";
	private static final String USUARIO = "postgres";
	private static final String URL = "jdbc:postgresql://localhost/loja";
	private static final String DRIVER_JDBC = "org.postgresql.Driver";

	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection(URL, USUARIO, SENHA);
			Scanner scan = new Scanner(System.in);
			System.out.println("Login ");
			String login = scan.nextLine();
			System.out.println("Senha: ");
			String senha = scan.nextLine();
			String sql = "SELECT * FROM usuario WHERE login = ? and senha =?";
			System.out.println(sql);
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, login);
			stmt.setString(2, senha);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				System.out.println("*********************************");
				System.out.println("Usuário Autenticado. Acesso total");
				System.out.println("*********************************");
			} else {
				System.out.println("Usuario ou senha incorretos");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
