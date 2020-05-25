import java.sql.*;

public class LivroConsulta {

	private static final String SENHA = "postgres";
	private static final String USUARIO = "postgres";
	private static final String URL = "jdbc:postgresql://localhost/loja";
	private static final String DRIVER_JDBC = "org.postgresql.Driver";

	public static void main(String[] args) {
		try {
			Class.forName(DRIVER_JDBC);
			Connection con = DriverManager.getConnection(URL, USUARIO, SENHA);
			try {
				Statement stmt = con.createStatement();
				String comandoSql = "select * from livro";
				ResultSet rs = stmt.executeQuery(comandoSql);
				System.out.printf("%-5s %-30s %-30s %-25s\n", "CODIGO", "TITULO", "AUTOR", "VALOR");

				while (rs.next()) {
					System.out.printf("%-5d%-30s%-30s%30.2f\n", rs.getInt("CODIGO"), rs.getString("TITULO"),
							rs.getString("AUTOR"), rs.getDouble("VALOR"));
				}
				rs.close();
				stmt.close();
			} finally {
				con.close();
			}
		} catch (ClassNotFoundException e) {
			System.out.println("Driver não encontrado");
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
