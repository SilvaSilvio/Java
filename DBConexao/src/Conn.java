import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conn {
	
	public Connection getConexao() {
		String url = "jdbc:mysql://localhost:3306/sgr";
		String user = "root"; 
		String password = "mysql";
		
		try {
			Connection connection = DriverManager.getConnection(url, user, password);
			System.out.println(connection);
		return connection;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
