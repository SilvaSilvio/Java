package EXEMPLOCONJUTO;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploConjunto {

	public static void main(String[] args) {
Set<String> conjuntoCores = new HashSet<String>();
	conjuntoCores.add("Azul");
	conjuntoCores.add("Amarelo");
	conjuntoCores.add("Preto");
	conjuntoCores.add("Vermelho");
	conjuntoCores.add("Verde");
	for(String umaCor : conjuntoCores) {
		System.out.println("Cor: " + umaCor);
	}
	if (conjuntoCores.contains("Azul")) {
		conjuntoCores.remove("Azul");
	}
	System.out.println("\n\n Conjunto Objeto Azul Excluido: ");
	for(Iterator<String> iter = conjuntoCores.iterator(); iter.hasNext();) {
		String umaCor = iter.next();
		System.out.println("Cor: " + umaCor);
	}
	
	conjuntoCores.clear();
	if(conjuntoCores.isEmpty()) {
		System.out.println("\n Conjunto estar vazio!!");
	}
	
	}

}
