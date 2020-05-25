import java.sql.Connection;

public class Principal {

	public static void main(String[] args) {

		Conn c = new Conn();
		System.out.println(c.getConexao());

	}
}
