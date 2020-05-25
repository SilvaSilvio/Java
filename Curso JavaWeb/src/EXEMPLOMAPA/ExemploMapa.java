package EXEMPLOMAPA;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ExemploMapa {
	public static void main(String[] args) {

		Map<String, String> mapaAluno = new HashMap<String, String>();
		mapaAluno.put("1021", "Jose da Silva");
		mapaAluno.put("1032", "Pedro de Andrade");
		mapaAluno.put("2045", "Antonio de Oliveira");
		mapaAluno.put("3155", "Maria Nascimento");

		for (Map.Entry<String, String> umItemMapa : mapaAluno.entrySet()) {
			System.out.printf("%s : %s \n ", umItemMapa.getKey(), umItemMapa.getValue());
		}
		System.out.println("\n OS VALORES DO MAPA APÓS A EXCLUSÃO DO ITEM 1021");
		mapaAluno.remove("1021");
		System.out.println(mapaAluno.values().toString());
		Scanner scan = new Scanner(System.in);
		System.out.printf("Digite o código %s: ", mapaAluno.keySet());
		String codigo = scan.nextLine();

		if (mapaAluno.containsKey(codigo)) {
			System.out.println(mapaAluno.get(codigo));
		} else {
			System.out.println("Item não encontrado");
		}
	}
}
