package AULA06EXCEPTION;

import java.util.Scanner;

public class ExemploAutenticacao {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o login: ");
		String login = scan.nextLine();
		System.out.println("Senha: ");
		String senha = scan.nextLine();
		
		AutenticadorSimples autenticadorSimples = new AutenticadorSimples();
		try {
			autenticadorSimples.autenticar(login, senha);
			System.out.println("Usuário Autenticado");
		}catch(Exception e) {
		System.out.println("Usuário não Autenticado");
		}
		
		AutenticadorAvancado autenticadorAvancado = new AutenticadorAvancado();
		try {
			autenticadorAvancado.autenticar(login, senha);
			System.out.println("Usuário autenticado");
		} catch (DadosIncorretosException e) {
			System.out.println(e.getMessage());
		} catch (SenhaNaoConfereException e) {
			System.out.println(e.getMessage());
		}
	
		
	}

}
