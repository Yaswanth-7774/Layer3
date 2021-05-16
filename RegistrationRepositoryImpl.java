package com.example.bus.repos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.bus.pojos.Registration;
@Repository
public class RegistrationRepositoryImpl implements RegistrationRepository {
	
	@PersistenceContext 
	EntityManager entityManager;
	@Transactional
	public void addRegistration(Registration reg) {
		// TODO Auto-generated method stub
		entityManager.persist(reg);
	}

	@Transactional
	public Registration findRegistration(String email) {
		// TODO Auto-generated method stub
		return entityManager.find(Registration.class, email);
	}

	@Transactional
	public List<Registration> findRegistrations() {
		// TODO Auto-generated method stub
		List<Registration> regList;
		regList = new ArrayList<Registration>();
		String queryString = "from Registrations"; 
		Query query=entityManager.createQuery(queryString);
		return null;
	}

	@Transactional
	public void modifyRegistration(Registration reg) {
		// TODO Auto-generated method stub
		entityManager.merge(reg);
	}

	@Transactional
	public void removeRegistration(String email) {
		// TODO Auto-generated method stub
		Registration regTemp= entityManager.find(Registration.class, email);
		entityManager.remove(regTemp);
	}

}
