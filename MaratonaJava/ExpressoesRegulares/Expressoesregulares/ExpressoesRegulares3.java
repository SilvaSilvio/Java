package Expressoesregulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegulares3 {

	public static void main(String[] args) {
		// \d irá buscar na pesquisa todos os digitos
		//\ D irá buscar tudo o que não for digito / numeros. 
		// \S verifica tudo o que não tem espaço.
		// \s Espaço em branco \t \r \n \f
		//a - c A - Z mostra todos as string do texto
		
		
		String regex = "\\D";
		String texto = "Controle123123";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(texto);
		System.out.println("Texto: " + texto);
		System.out.println("Indice: 1 2 3 4 5 6 7 8 9");
		System.out.println("Expressões: " + matcher.pattern());
		System.out.println("Valores encontrados: ");
		while(matcher.find()) {
			System.out.print(matcher.start());
		}
	}

}
