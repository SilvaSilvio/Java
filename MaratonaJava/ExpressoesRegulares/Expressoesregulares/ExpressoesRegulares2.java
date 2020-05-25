package Expressoesregulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegulares2 {

	public static void main(String[] args) {
		String regex = "s";
		String texto = "asaasa";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(texto);
		System.out.println("Texto: "  + texto);
		System.out.println("Indice: 123456789 ");
		System.out.println("Expressões: " + matcher.pattern());
//		if(matcher.find() == true) {
		System.out.print("Posições encotradas: ");
		while (matcher.find()) {
			System.out.print(matcher.start() + " ");
//		}
	//	}else {
		//	System.out.println("Nenhuma posiçao encontrada");
		}
	
	
	
	}

}
