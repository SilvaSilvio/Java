package loja;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ExemploLivroJPA {

	public static void main(String[] args) {
		/*EntityManagerFactory emf = Persistence.createEntityManagerFactory("loja");
		EntityManager em = emf.createEntityManager();
		*/
		LivroDao dl = new LivroDao();
		try {
			dl.consultar();
		} catch (LojaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scanner scan = new Scanner(System.in);
		//Query query = em.createQuery("Select lv from livro lv");
		//List<Livro> resultado = query.getResultList();
		
	//	for (Livro umLivro : resultado) {
		//	System.out.println(umLivro.getTitulo());
	//	}
		
		Livro livro = new Livro();
		System.out.println("Titulo: ");
		livro.setTitulo(scan.nextLine());
		System.out.println("Autor: ");
		livro.setAutor(scan.nextLine());
		System.out.println("Imagem: ");
		livro.setImagem(scan.nextLine());
		System.out.println("Valor: ");
		livro.setValor(scan.nextDouble());
		
	/*	em.getTransaction().begin();
		em.persist(livro);
		em.getTransaction().commit();
		*/
	}

}
