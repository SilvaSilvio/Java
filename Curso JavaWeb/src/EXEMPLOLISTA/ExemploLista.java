package EXEMPLOLISTA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploLista {
	public static void main(String[] args) {
		List<String> listaCores = new ArrayList<String>();
		listaCores.add("Azul");
		listaCores.add("Verdelho");
		listaCores.add("Amarelo");
		listaCores.add("Preto");
		listaCores.add("Preto embranquecido");
		listaCores.add("Verde");
		listaCores.add("Rosa");

		System.out.println("LISTA ORDENADA");
		System.out.println("-------------------------");
		for (String umaCor : listaCores) {
			System.out.println("Cor: " + umaCor);
		}

		Collections.sort(listaCores);
		
		System.out.println("\n\n Lista Ordenada");
		System.out.println("-------------------------");
		for (int i = 0; i < listaCores.size(); i++) {
			String umaCor = listaCores.get(i);
			System.out.println("Cor: " + umaCor);
		}
		
		if (listaCores.contains("Azul")) {
			listaCores.remove("Azul");
		}
		
		if(listaCores.indexOf("Azul") >=0) {
			listaCores.remove(listaCores.indexOf("Azul"));
		}
		System.out.println("\n\nLista Ordenada Objeto Azul Excluido: ");
		System.out.println("-------------------------");
		for(Iterator<String> iter = listaCores.iterator(); iter.hasNext();) {
			String umaCor = iter.next();
			System.out.printf("Cor: %s\n ", umaCor);
		}
		listaCores.clear();
		if(listaCores.isEmpty()) {
			System.out.println("\nA lista está vazia!");
		}
	}

}
