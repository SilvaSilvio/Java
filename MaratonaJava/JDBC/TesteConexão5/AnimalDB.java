package TesteConexão5;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AnimalDB {
	public static void save() {
		String sql = "INSERT INTO public.animal(id_animal, nome, raca, peso) VALUES (2, 'Macaco','Gorila', 300);\n"
				+ "";
		Connection conn = ConnectionFactoy.getConecxao();
		try {
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			System.out.println("Animal inserido com sucesso");
			ConnectionFactoy.close(conn, stmt);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void delete() {
		String sql = "DELETE FROM animal WHERE id_Animal = 1";
		Connection conn = ConnectionFactoy.getConecxao();
		try {
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(sql);

			System.out.println("Animal deletado com sucesso");
			ConnectionFactoy.close(conn, stmt);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void update() {
		String sql = "UPDATE public.animal  SET id_animal = 1, nome = 'Cachorro', raca = 'Vira-Lata', peso = 10 WHERE id_animal = 1";
		Connection conn = ConnectionFactoy.getConecxao();
		try {
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(sql);

			System.out.println("Animal atualizado com sucesso");
			ConnectionFactoy.close(conn, stmt);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void sellectAll() {
		String sql = "SELECT * FROM animal";
		Connection conn = ConnectionFactoy.getConecxao();
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				System.out.println("Id: " + rs.getInt("id_animal"));
				System.out.println("Nome: " + rs.getString("nome"));
				System.out.println("raça: " + rs.getString("raca"));
				System.out.println("peso: " + rs.getDouble("peso"));
				System.out.println("-----------------------------------");
			}

			ConnectionFactoy.close(conn, stmt, rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
