package org.talend.ps.jpa.service;

import org.talend.jpa.IdType;
import org.talend.jpa.JPAService;
import org.talend.jpa.PersonType;
import org.talend.ps.jpa.persistence.PersistenceHelper;
import org.talend.ps.jpa.persistence.Person;

/**
 * This class implements a generic policy provider.
 * 
 */
public class JPAServiceProvider implements JPAService {

    private PersistenceHelper persistenceHelper;
    
 	public void setPersistenceHelper(PersistenceHelper persistenceHelper) {
		this.persistenceHelper = persistenceHelper;
	}

	@Override
	public String delete(IdType id) {
		if (persistenceHelper.delete(id.getId())) {
			return "OK";
		} else {
			return "Not exist";
		}
	}

	@Override
	public String persist(PersonType person) {
		Person personTO = new Person(person.getId(), person.getName(), person.getTwitterName());
		persistenceHelper.persist(personTO);
		return "OK";
	}

}