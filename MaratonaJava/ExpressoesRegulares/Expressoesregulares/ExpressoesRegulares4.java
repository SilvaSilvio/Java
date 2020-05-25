package Expressoesregulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegulares4 {

	public static void main(String[] args) {
		/*
		 * A ultilizaão dos [] mostra uma string especifica ex: [abcAD]. Expressões
		 * regulares: ? == zero ou uma == zero ou mais + == uma ou mais () ==
		 * Customizada
		 	s == espaço em branco, bem como \t \n \f \r
		 */

		String regex = "0[xX]([0-9a-fA-F])+"/*(\\s\$)*/;
		String text = "12 0X 0x 0xFFABC 0x10G 0x1";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);
		System.out.println("Texto: " + text);
		System.out.println("Indice: 0 1 2 3 4 5 6 7 8 9");
		System.out.println("expressoes : " + matcher.pattern());
		System.out.println("Posições encontradas");
		while (matcher.find()) {
			System.out.println(matcher.start() + " " + matcher.group());
		}

	}

}
