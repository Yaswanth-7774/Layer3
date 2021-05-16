package com.example.bus.repos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.bus.pojos.Auth;
import com.example.demo.layer2.Department5;
@Repository
public class AuthorisedTicketRepositoryImpl implements AuthorisedTicketRepository {
	@PersistenceContext

	EntityManager entityManager;
	@Transactional
	public void addAuthorisedTicket(Auth auth) {
		// TODO Auto-generated method stub
		entityManager.persist(auth);
	}

	@Transactional
	public Auth findAuthorisedTicket(int id) {
		// TODO Auto-generated method stub
		return entityManager.find(Auth.class,id);
	}

	@Transactional
	public List<Auth> findAuthorisedTickets() {
		List<Auth> AuthTickList;
		AuthTickList = new ArrayList<Auth>();
		
			String queryString = "from Auth";
			Query query = entityManager.createQuery(queryString);
			AuthTickList = query.getResultList();
		return AuthTickList;
	}

	@Transactional
	public void modifyAuthorisedTicket(Auth auth) {
		// TODO Auto-generated method stub
		entityManager.merge(auth);
	}

	@Transactional
	public void removeAuthorisedTicket(int id) {
		// TODO Auto-generated method stub
		Auth aTemp = entityManager.find(Auth.class,id);
		entityManager.remove(aTemp);
	}

}
