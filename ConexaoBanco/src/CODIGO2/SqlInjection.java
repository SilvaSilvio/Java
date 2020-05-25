package CODIGO2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SqlInjection {
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
			String sql = "select * from usuario WHERE login = '" + login + "' " + "and senha ='" + senha + "'";
			System.out.println(sql);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

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
