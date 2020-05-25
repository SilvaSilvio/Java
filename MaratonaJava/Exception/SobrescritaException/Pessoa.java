package SobrescritaException;

import java.io.FileNotFoundException;

import CadastroUsuario.LoginInvalidoException;

public class Pessoa {
	public void salvar() throws LoginInvalidoException, FileNotFoundException {
System.out.println("Pessoa Salva");
	}
}
