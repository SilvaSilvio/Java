package loja;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConexaoJpa {
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("loja");

	public static EntityManager getEntityManager() {
		return emf.createEntityManager();
	}
}
