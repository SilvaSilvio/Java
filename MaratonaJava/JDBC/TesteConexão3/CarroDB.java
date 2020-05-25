package TesteConexão3;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CarroDB {
	public static void save() {
		String sql = "INSERT INTO public.carro(\n" + "           placa, modelo)\n"
				+ "    VALUES ('AAA123', 'Ferrari');";
		Connection conn = ConnectFactory.getConnection();
		try {
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			System.out.println("dados incluídos com sucesso");
			ConnectFactory.close(conn, stmt);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void delete() {
		String sql = "DELETE FROM public.carro WHERE Id_carro = '1'";
		Connection conn = ConnectFactory.getConnection();
		try {
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			System.out.println("dados excluído com sucesso");
			ConnectFactory.close(conn, stmt);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void sellectAll() {
		String sql = "SELECT * FROM carro";
		Connection conn = ConnectFactory.getConnection();
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.println(rs.getString("placa"));
				System.out.println(rs.getString("modelo"));
			}
			ConnectFactory.close(conn, stmt, rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
