package SobrescritaException;

import java.io.IOException;

import CadastroUsuario.LoginInvalidoException;

public class teste {

	public static void main(String... args) throws LoginInvalidoException {
	Funcionario f = new Funcionario();
	Pessoa p = new Pessoa();
	f.salvar();
	//Quando o metodo é sobrescrito, será necessário o uso de excessões.
	try {
	p.salvar();
	}catch (IOException e) {
	e.printStackTrace();
	}
	}

}
