package FORNECEDOR;

import java.util.List;

public class Agenda {

	public static void main(String[] args) {

		Pessoa p = new Pessoa("Silvio", "2345678");
		System.out.println(p);
		
		Fornecedor[] f = new Fornecedor[4];
		f[0] = new Fornecedor("Silvio", "234", "Raçao");
		f[1] = new Fornecedor("Beuga", "12341234", "Picolé");
		f[3] = new Fornecedor("Sérgio", "12312312", "Celular");
		for (Fornecedor fornecedor : f) {
			System.out.println(fornecedor);
			
		}
		
	}

}
