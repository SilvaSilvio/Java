package CustomeException;

public class principal {

	public static void main(String[] args) {

		try {
			logar();
		} catch (LoginInvalidoException e) {
			e.printStackTrace();
		}

	}

	private static void logar() throws LoginInvalidoException {
		String usuarioBancoDados = "Beuga";
		String senhaBancoDados = "123";
		String usuarioDigitado = "Beuga";
		String senhaDigigitada = "123";
		if (!usuarioBancoDados.equals(usuarioDigitado) || !senhaBancoDados.equals(senhaDigigitada)) {
			throw new LoginInvalidoException();
		} else {
			System.out.println("Logado");
		}

	}
}
