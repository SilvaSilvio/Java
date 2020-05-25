package StringS;

public class StringTest {

	public static void main(String[] args) {
	String nome = "Silvio";
	//nome += " Silva";
	nome = nome.concat(" Silva");
	//	String sobrenome = new String(" Silva");
	
	String teste = "Goku";
	String teste2 = "goku";
	
	System.out.println(teste.charAt(2));
	//Verifica a letra de acordo com sua posição.
	System.out.println(teste.equalsIgnoreCase(teste2));
	//verifia se uma atributo e igual ao outro utilizando o equals
	System.out.println(teste2.length());
	//O length verica a quantidade de caractere..
	}

}
