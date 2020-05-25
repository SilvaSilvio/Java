package model.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.ConexaoBancoDados;
import model.entity.Livro;

public class LivroDAO {
	private static EntityManager em = ConexaoBancoDados.getEntityManager();

	public static void inserir(Livro livro) throws Exception {
		em.getTransaction().begin();
		em.persist(livro);
		em.getTransaction().commit();
	}

	public static void alterar(Livro livro) throws Exception {
		em.getTransaction().begin();
		em.merge(livro);
		em.getTransaction().commit();
	}

	public static Livro consultar(int codigo) throws Exception {
		return em.find(Livro.class, codigo);
	}

	@SuppressWarnings("unchecked")
	public static List<Livro> consultar() throws Exception {
		Query query = em.createNativeQuery("select * from livro", Livro.class);
		return query.getResultList();
	}

	@SuppressWarnings("unchecked")
	public static List<Livro> consultar(String titulo) throws Exception {
		Query query = em.createNativeQuery("select * from livro where upper(titulo) like upper(:titulo)", Livro.class);
		query.setParameter("titulo", "%" + titulo + "%");
		return query.getResultList();
	}
}