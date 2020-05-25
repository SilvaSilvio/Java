package TesteConexão2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectFactory {

	public static Connection getConnection() {
	String url = "jdbc:postgresql://localhost/agencia";
	String user = "postgres";
	String password = "postgres";
	
	try {
	return DriverManager.getConnection(url,user, password);	
	}catch(SQLException e) {
		e.printStackTrace();
	}
	return null;
	}
}
