package Expressoesregulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressõesRegurares5 {
	public static void main(String... args) {
		// . == coringa, pode ser substituido por qualquer coisa. ex: 1.2, 122, 112, 1a2, 1A2.
		// \d tudo o que for digito
		// ^ exclusão - 94 
		String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+\\.([a-zA-Z])+";
		String texto = "siviobeuga@gmail.com, abc@gmail.com, haha1232@hotmail.com.br";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(texto);
		System.out.println("Texto: " + texto);
		System.out.println("Indice: 1 2 3 4 5 6 7 8 9");
		System.out.println("Expressoes: " + matcher.pattern());
		System.out.print("Valores encontrados: ");
		while (matcher.find()) {
			System.out.print(matcher.start()+ " "+ matcher.group() ); 
		}
	}
}
