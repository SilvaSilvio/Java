package AULA06EXCEPTION;

public class AutenticadorSimples {
	
	public void autenticar(String login, String senha) throws Exception {
		if (login.length() == 0 || senha.length() == 0) {
			throw new Exception("Dados Incompletos..");

		}
		if (!login.equals("Jose") || !senha.equals("123")) {
			throw new Exception("Senha não confere");

		}
	}

}
