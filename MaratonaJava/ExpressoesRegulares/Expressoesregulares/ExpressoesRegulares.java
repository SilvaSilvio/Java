package Expressoesregulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegulares {
public static void main(String...args) {
	//String regex = "";
	//String texto = "";
	String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+\\.([a-zA-Z])+";
	String texto = "fulano@hotmail.com, 102Abc@gmail.com, teste@gmail.com.br";
	Pattern pattern = Pattern.compile(regex);
	Matcher matcher = pattern.matcher(texto);
	System.out.println("Texto: " + texto);
	System.out.println(matcher.pattern());
	while(matcher.find()){
		System.out.println(matcher.start() + " " + matcher.group());	}
}
}
