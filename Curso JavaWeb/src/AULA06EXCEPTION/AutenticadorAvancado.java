package AULA06EXCEPTION;

public class AutenticadorAvancado {
	public void autenticar(String login, String senha) throws DadosIncorretosException, SenhaNaoConfereException {
		if (login.length() == 0 || senha.length() == 0) {
			throw new DadosIncorretosException("Dados incompletos");
		}
		if (!login.equals("José") || !senha.equals("123")) {
			throw new SenhaNaoConfereException("Senha não confere.");
		}
	}
}
