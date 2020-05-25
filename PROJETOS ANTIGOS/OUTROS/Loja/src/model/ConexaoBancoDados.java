package model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConexaoBancoDados {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("loja");

	public static EntityManager getEntityManager() {
		return emf.createEntityManager();
	}
}
