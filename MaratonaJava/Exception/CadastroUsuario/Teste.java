package CadastroUsuario;

public class Teste {

	public static void main(String[] args) {
		try {
		logar();
		}catch(LoginInvalidoException e){
			e.printStackTrace();
		}

	}
public static void logar() throws LoginInvalidoException {
	String usuario = "Silvio";
	String senha = "123";
	String usuarioBancoDados = "Silvio";
	String senhaBancoDados = "1213";
	
	if(!usuario.equals(usuarioBancoDados) || !senha.equals(senhaBancoDados)){
		throw new LoginInvalidoException();
	}else {
		System.out.println("Você está logado");
	}
}
}
