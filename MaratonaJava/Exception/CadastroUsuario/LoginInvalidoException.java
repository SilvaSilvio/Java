package CadastroUsuario;

public class LoginInvalidoException extends Exception{

	public LoginInvalidoException() {
		super("Usuario ou senha inválido");
	}
}
