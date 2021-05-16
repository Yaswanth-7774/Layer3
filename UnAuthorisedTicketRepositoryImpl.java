package com.example.bus.repos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.bus.pojos.Auth;
import com.example.bus.pojos.Unauth;
import com.example.demo.layer2.Department5;
@Repository
public class UnAuthorisedTicketRepositoryImpl implements UnAuthorisedTicketRepository {
	@PersistenceContext

	EntityManager entityManager;
	@Transactional
	public void addUnAuthorisedTicket(Unauth unauth) {
		// TODO Auto-generated method stub
		entityManager.persist(unauth);
	}

	@Transactional
	public Unauth findUnAuthorisedTicket(int id) {
		// TODO Auto-generated method stub
		return entityManager.find(Unauth.class,id);
	}

	@Transactional
	public List<Unauth> findUnAuthorisedTickets() {
		List<Unauth> UnAuthTickList;
		UnAuthTickList = new ArrayList<Unauth>();
		
			String queryString = "from Unauth";
			Query query = entityManager.createQuery(queryString);
			UnAuthTickList = query.getResultList();
		return UnAuthTickList;
	}

	@Transactional
	public void modifyUnAuthorisedTicket(Unauth unauth) {
		// TODO Auto-generated method stub
		entityManager.merge(unauth);
	}

	@Transactional
	public void removeUnAuthorisedTicket(int id) {
		// TODO Auto-generated method stub
		Unauth aTemp = entityManager.find(Unauth.class,id);
		entityManager.remove(aTemp);
	}

}
