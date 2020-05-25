package Principal;

import Entity.Produto;
import JDBC.ConnectFactory;
import JDBC.ProdutoDB;

public class Main {
	public static void main(String[] args) {
		ConnectFactory conn = new ConnectFactory();
//System.out.println(conn.getConexao());
Produto p = new Produto();
p.setNome("Teclado");
p.setValor(120.0);
ProdutoDB pd = new ProdutoDB();
pd.save(p);
//UsuarioDB usuario = new UsuarioDB();
//usuario.save();
	}
}
