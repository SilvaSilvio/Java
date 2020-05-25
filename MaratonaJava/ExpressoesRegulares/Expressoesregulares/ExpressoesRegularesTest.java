package Expressoesregulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegularesTest {

	public static void main(String... args) {
String regex = "i";
String texto = "Silvio Ferreira da Silva";
Pattern pattern = Pattern.compile(regex);
Matcher matcher = pattern.matcher(texto);
System.out.println("Texto: " + texto);
System.out.println("indice: 123456789 ");
System.out.println("Expressão: " + matcher.pattern());
System.out.println("Posições encontradas: ");
while(matcher.find()) {
	System.out.print(matcher.start() + " ");
}

	}

}
