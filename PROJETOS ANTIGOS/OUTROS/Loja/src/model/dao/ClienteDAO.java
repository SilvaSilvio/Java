package model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import model.ConexaoBancoDados;
import model.entity.Cliente;

public class ClienteDAO {
	private static EntityManager em = ConexaoBancoDados.getEntityManager();

	public static void inserir(Cliente cliente) throws Exception {
		em.getTransaction().begin();
		em.persist(cliente);
		em.getTransaction().commit();
	}

	public static void alterar(Cliente cliente) throws Exception {
		em.getTransaction().begin();
		em.merge(cliente);
		em.getTransaction().commit();
	}

	public static Cliente consultar(int codigo) throws Exception {
		return em.find(Cliente.class, codigo);
	}

	@SuppressWarnings("unchecked")
	public static List<Cliente> consultar() throws Exception {
		Query query = em.createNativeQuery("select * from cliente", Cliente.class);
		return query.getResultList();
	}

	/*public static Cliente consultar(String login) throws Exception {
		Query query = em.createNativeQuery("select * from cliente where upper(login) = upper(:login)", Cliente.class);
		query.setParameter("login", login);
		Cliente cliente = (Cliente) query.getSingleResult();
		return cliente;
	}
	*/
	
	public static Cliente consultar(String login) throws Exception {
		//Query query = em.createNativeQuery("select * from cliente where upper(login) = upper(:login)", Cliente.class);
		TypedQuery<Cliente> query = em.createQuery("from Cliente c where upper(c.login) = upper(:login)", Cliente.class);
		query.setParameter("login", login);
		List<Cliente> clientes = query.getResultList();
		Cliente cliente = null;
		if(clientes!=null && clientes.size()>0) {
			cliente = clientes.get(0);
		}
		return cliente;
	}

	public static Cliente autenticar(String login, String senha) throws Exception {
		Cliente cliente = consultar(login);
		if (cliente!=null && cliente.getSenha().equals(senha)) {
			return cliente;
		} else {
			return null;
		}
	}
}
