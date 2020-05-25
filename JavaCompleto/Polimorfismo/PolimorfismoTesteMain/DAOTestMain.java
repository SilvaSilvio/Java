package PolimorfismoTesteMain;

import java.util.ArrayList;
import java.util.List;

import Arquivo.ArquivoDAOImpl;

public class DAOTestMain {

	public static void main(String[] args) {
		ArquivoDAOImpl arquivoDAO = new ArquivoDAOImpl();
		arquivoDAO.save();
		
		List<String> list = new ArrayList<>();
		list.add("nome");
		list.add("nome1");
		list.add("nome2");
		list.add("nome3");
		
		//Criando Array de String
		String[] nomes = new String[10];
		nomes[0]= "Silvio";
		nomes[1] = "Sergio";
		nomes[3] = "Darkson";
		
		for(String n : nomes)
			System.out.println(n);
		System.out.println("------------");
		
		//Criando List
		for(String nome : list)
			System.out.println(nome);
		
		list.remove("nome2");
		System.out.println("---------");
		
		for(String nome : list)
			System.out.println(nome);
		
		

	}

}
