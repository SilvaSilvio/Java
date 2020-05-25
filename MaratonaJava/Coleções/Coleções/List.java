package Coleções;

import java.util.ArrayList;

public class List {

	public static void main(String[] args) {
		ArrayList<String> nome = new ArrayList<>();
		ArrayList<String> nome2 = new ArrayList<String>();
		nome.add("Silvio");
		nome.add("Ferreira");
		nome2.add("Silvio1");
		nome2.add("Ferreira1");
		nome.addAll(nome2);	
//	System.out.println(nome.remove(0));

		// for (int i = 0; i < nome.size(); i++) {
		// System.out.println(nome.get(i));
		// }

		for (String nomes : nome) {
			System.out.println(nomes);
		}

	}

}