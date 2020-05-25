package TesteConexão2;

import java.sql.Connection;

public class TestConexao {

	public static void main(String[] args) {
		ConnectFactory conn = new ConnectFactory();
	System.out.println(conn.getConnection());	


}
}
