package utils;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class EntityManagerSingleton {
	private static EntityManager INSTANCE = null;

	public static EntityManager getInstance() {
		if (INSTANCE == null) {
			INSTANCE = Persistence.createEntityManagerFactory("BDD_JPA")
					.createEntityManager();
		}
			return INSTANCE;
		}
}