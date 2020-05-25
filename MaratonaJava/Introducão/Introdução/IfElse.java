package Introdução;

public class IfElse {

	public static void main(String[] args) {
		
		int idade = 17;
		String categoria;
		
		if(idade < 18) {
				categoria = "infantil";
		}
		else {
			categoria = "adulto";
		}
		System.out.println(categoria);
	}

}
