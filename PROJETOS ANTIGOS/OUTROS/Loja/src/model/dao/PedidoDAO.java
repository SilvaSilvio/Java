package model.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.ConexaoBancoDados;
import model.entity.Cliente;
import model.entity.Pedido;

public class PedidoDAO {
	private static EntityManager em = ConexaoBancoDados.getEntityManager();

	public static void inserir(Pedido pedido) throws Exception {
		em.getTransaction().begin();
		em.persist(pedido);
		em.getTransaction().commit();
	}

	public static void alterar(Pedido pedido) throws Exception {
		em.getTransaction().begin();
		em.merge(pedido);
		em.getTransaction().commit();
	}

	public static Pedido consultar(int codigo) throws Exception {
		return em.find(Pedido.class, codigo);
	}

	@SuppressWarnings("unchecked")
	public static List<Pedido> consultar() throws Exception {
		Query query = em.createNativeQuery("select * from pedido", Pedido.class);
		return query.getResultList();
	}

	@SuppressWarnings("unchecked")
	public static List<Pedido> consultar(Cliente cliente) throws Exception {
		String sql = "select * from pedido p inner join cliente c on (p.cliente_codigo = c.codigo) where c.codigo = :codigo";
		Query query = em.createNativeQuery(sql, Pedido.class);
		query.setParameter("codigo", cliente.getCodigo());
		return query.getResultList();
	}
}