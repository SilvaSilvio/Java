package AULA3;

import static java.lang.Math.*;
import static java.lang.System.*;
public class principal {

	public static void main(String[] args) {

		Pessoa.especie = "Homo Sapiens";
		Pessoa p = new Pessoa("Beuga");
		p.imprimirDados();

		Pessoa p2 = new Pessoa("Jão");
		p2.imprimirDadosClasse();
		System.out.println(Math.PI);
	}
	
}
