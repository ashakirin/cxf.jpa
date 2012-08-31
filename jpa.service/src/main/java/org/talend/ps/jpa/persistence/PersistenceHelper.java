package org.talend.ps.jpa.persistence;


public interface PersistenceHelper {
	
	void persist(Person person);
	boolean delete(String id);
	void select();
}
