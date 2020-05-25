package model;

import model.dao.ClienteDAO;
import model.dao.LivroDAO;
import model.entity.Cliente;
import model.entity.Livro;

public class PopularBancoDados {
	public static void main(String[] args) {
		try {
			Cliente c1 = new Cliente();
			c1.setLogin("teste");
			c1.setSenha("teste");
			c1.setNome("Cliente Teste");
			ClienteDAO.inserir(c1);

			Livro l1 = new Livro();
			l1.setAutor("Verne, Julio");
			l1.setTitulo("Vinte Mil Líguas Submarinas");
			l1.setImagem("imagens/submarinas.jpg");
			l1.setValor(14.9);
			LivroDAO.inserir(l1);

			Livro l2 = new Livro();
			l2.setAutor("Rosa, João Guimarães");
			l2.setTitulo("Grande Sertão - Veredas");
			l2.setImagem("imagens/veredas.jpg");
			l2.setValor(165);
			LivroDAO.inserir(l2);

			Livro l3 = new Livro();
			l3.setAutor("Yalom, Irvin D.");
			l3.setTitulo("Quando Nietzsche Chorou");
			l3.setImagem("imagens/chorou.jpg");
			l3.setValor(49.90);
			LivroDAO.inserir(l3);

			Livro l4 = new Livro();
			l4.setAutor("Verne, Julio");
			l4.setTitulo("Volta ao Mundo em Oitenta Dias");
			l4.setImagem("imagens/volta_mundo.jpg");
			l4.setValor(16.5);
			LivroDAO.inserir(l4);

			Livro l5 = new Livro();
			l5.setAutor("Verne, Julio");
			l5.setTitulo("Cristovao Colombo");
			l5.setImagem("imagens/colombo.jpg");
			l5.setValor(16.5);
			LivroDAO.inserir(l5);
		} catch (Exception e) {
			System.out.println("Erro ao executar inserção no Banco de Dados: " + e.getMessage());
		}
	}
}
