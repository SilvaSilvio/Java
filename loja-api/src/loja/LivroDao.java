package loja;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

public class LivroDao {
	private EntityManager em = ConexaoJpa.getEntityManager();

	public void inserir(Livro livro) throws LojaException {
		em.getTransaction().begin();
		em.persist(livro);
		em.getTransaction().commit();
	}

	public void alterar(Livro livro) throws LojaException {
		em.getTransaction().begin();
		em.merge(livro);
		em.getTransaction().commit();
	}

	public Livro consultar(int codigo) throws LojaException {
		return em.find(Livro.class, codigo);
	}

	public List<Livro> consultar(String titulo) throws LojaException {
	Query query = em.createNativeQuery("select * from livro where upper(titulo) like upper(:titulo)", Livro.class);
	query.setParameter("titulo", "%" + titulo + "%");
	return query.getResultList();
	}

	public List<Livro> consultar() throws LojaException {
	Query query = em.createNativeQuery("select * from livro", Livro.class);
	return query.getResultList();
	}
}
