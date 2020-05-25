package TesteConexão4;

public class TestConnection {

	public static void main(String[] args) {
ConnectionFactory conexao = new ConnectionFactory();
//System.out.println(conexao.getConexao());
UsuarioDB usuario = new UsuarioDB();
usuario.save();
	}

}
