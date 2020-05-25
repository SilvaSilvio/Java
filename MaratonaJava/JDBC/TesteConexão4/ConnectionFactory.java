package TesteConexão4;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
public static  Connection getConexao() {
	String url = "jdbc:postgresql://localhost/silvio";
	String user = "postgres";
	String password = "postgres";
try {
	return DriverManager.getConnection(url, user, password);
} catch (SQLException e) {
	e.printStackTrace();
}
return null;
}

}
