package org.talend.ps.jpa.persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

public class PersistenceHelperNonJTA implements PersistenceHelper {

	private static final String QUERY_ALL_PERSONS = "ALL_PERSONS";
	private EntityManager em;

	public void setEmFactory(EntityManagerFactory emFactory) {
		em = emFactory.createEntityManager();
	}

	public void persist(Person person) {
		try {
			em.getTransaction().begin();
			System.out.println("Before persist");
			em.persist(person);
			System.out.println("After persist");
			em.flush();
			System.out.println("After flush");
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new IllegalStateException("Persistency error: "
					+ e.getMessage(), e);
		}
	}

	public boolean delete(String id) {
		try {
			Person person = em.find(Person.class, id);
			if (person == null) {
				return false;
			}
			em.getTransaction().begin();
			em.remove(person);
			em.getTransaction().commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw new IllegalStateException("Persistency error: "
					+ e.getMessage(), e);
		}
	}

	public void select() {
		Query preparedQuery = em.createNamedQuery(QUERY_ALL_PERSONS);
		@SuppressWarnings("unchecked")
		List<Person> results = preparedQuery.getResultList();
		results.size();
	}
}
