package ProjetoAnimal;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class AnimalDB {
	public void save(Animal animal) {
//		String sql = "INSERT INTO public.comprador(nome, raca) VALUES ('" + animal.getNome() + "','"
		// + animal.getRaca() + "');";
		String agoravai = "INSERT INTO public.animal(id_animal, nome, raca, peso) VALUES (1, 'cacao', 'Vira-Lata', 3);";

		// String sql = "INSERT INTO animal(nome, raca, peso) VALUES
		// ('Furacão','pincher', '3')";
		Connection conn = ConnectionFactory.getConnection();
		try {
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(agoravai);
			ConnectionFactory.close(conn, stmt);
			System.out.println("Usuário cadastrado com sucesso   (* _ *)");
		} catch (SQLException e) {
			System.out.println("Não foi possivel cadastrar esse animalzinho");
			e.printStackTrace();

		}
	}
}
